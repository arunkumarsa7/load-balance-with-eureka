package com.rate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaRateDisplayApplication {

	public static void main(final String[] args) {
		SpringApplication.run(EurekaRateDisplayApplication.class, args);
	}

}
