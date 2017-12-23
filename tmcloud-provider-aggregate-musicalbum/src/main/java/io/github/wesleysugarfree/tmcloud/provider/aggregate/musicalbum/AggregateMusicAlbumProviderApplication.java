
package io.github.wesleysugarfree.tmcloud.provider.aggregate.musicalbum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = "io.github.wesleysugarfree.tmcloud")
@EnableEurekaClient
public class AggregateMusicAlbumProviderApplication {
	public static void main(String[] args) {
        SpringApplication.run(AggregateMusicAlbumProviderApplication.class, args);
	}

}