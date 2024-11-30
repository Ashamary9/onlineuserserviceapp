package com.online.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OnlineUserServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineUserServiceAppApplication.class, args);
	}

}
