package com.srisad.ems.userstoryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient
@EnableJpaRepositories(basePackages = "com.srisad.ems.userstoryservice.repository")
@SpringBootApplication
public class UserstoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserstoryServiceApplication.class, args);
	}
}
