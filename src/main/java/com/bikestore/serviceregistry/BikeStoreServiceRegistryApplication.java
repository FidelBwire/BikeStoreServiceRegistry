package com.bikestore.serviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BikeStoreServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(BikeStoreServiceRegistryApplication.class, args);
	}

}
