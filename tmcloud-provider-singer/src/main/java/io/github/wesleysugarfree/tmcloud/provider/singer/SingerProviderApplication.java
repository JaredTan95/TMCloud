/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.singer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "io.github.wesleysugarfree.tmcloud")
@EnableEurekaClient
@MapperScan("io.github.wesleysugarfree.tmcloud.provider.singer.dao.mapper")
public class SingerProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(SingerProviderApplication.class, args);
    }
}
