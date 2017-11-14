/*
 * Copyright (c) 重庆交通大学.信息科学与工程学院.
 */

package io.github.wesleysugarfree.tmcloud.provider.usercomment;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "io.github.wesleysugarfree.tmcloud")
@EnableEurekaClient
@MapperScan("io.github.wesleysugarfree.tmcloud.provider.usercomment.dao.mapper")
public class UserCommentProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserCommentProviderApplication.class, args);
    }
}
