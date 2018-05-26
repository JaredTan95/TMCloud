

package io.github.wesleysugarfree.tmcloud.provider.album.dao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "io.github.wesleysugarfree.tmcloud")
@EnableEurekaClient
public class AlbumProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(AlbumProviderApplication.class, args);
    }
}
