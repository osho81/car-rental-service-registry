package com.osho.twserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class TwServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwServiceRegistryApplication.class, args);
	}

}
