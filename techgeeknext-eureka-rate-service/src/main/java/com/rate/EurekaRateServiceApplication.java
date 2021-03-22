package com.rate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaRateServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaRateServiceApplication.class, args);
	}
	
}
