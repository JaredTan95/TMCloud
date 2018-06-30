package io.github.jaredtan95.tmcloud.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringCloudApplication
@SpringBootApplication(scanBasePackages = "io.github.wesleysugarfree.tmcloud.auth")
public class AuthApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthApplication.class, args);
    }
    //TODO：该模块未完车。
}
