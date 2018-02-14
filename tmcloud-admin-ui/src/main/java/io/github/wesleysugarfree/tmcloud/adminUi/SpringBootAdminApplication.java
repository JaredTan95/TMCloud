/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.adminUi;

import de.codecentric.boot.admin.config.EnableAdminServer;
import de.codecentric.boot.admin.notify.Notifier;
import de.codecentric.boot.admin.notify.RemindingNotifier;
import de.codecentric.boot.admin.notify.filter.FilteringNotifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

import java.util.concurrent.TimeUnit;

@Configuration
@EnableAutoConfiguration
@EnableDiscoveryClient
@EnableAdminServer
public class SpringBootAdminApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringBootAdminApplication.class).web(true).run(args);
    }

    @Configuration
    @EnableScheduling
    public class NotifierConfiguration {
        @Autowired
        private Notifier delegate;

        @Bean
        public FilteringNotifier filteringNotifier() {
            return new FilteringNotifier(delegate);
        }

        @Bean
        @Primary
        public RemindingNotifier remindingNotifier() {
            RemindingNotifier notifier = new RemindingNotifier(filteringNotifier());
            notifier.setReminderPeriod(TimeUnit.SECONDS.toMillis(10));
            return notifier;
        }

        @Scheduled(fixedRate = 1_000L)
        public void remind() {
            remindingNotifier().sendReminders();
        }
    }


}
