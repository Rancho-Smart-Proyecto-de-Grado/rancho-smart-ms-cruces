package com.rancho_smart.ms_cruces;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MsCrucesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsCrucesApplication.class, args);
	}

}