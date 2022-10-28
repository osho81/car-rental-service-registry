package com.osho.twserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/*Eureka server setup project
 * Connected Eureka clients/microservices:
 		* cloud api gateway
 		* car rental project
 		* exchange service
*/
@EnableEurekaServer
@SpringBootApplication
public class TwServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwServiceRegistryApplication.class, args);
	}

}
