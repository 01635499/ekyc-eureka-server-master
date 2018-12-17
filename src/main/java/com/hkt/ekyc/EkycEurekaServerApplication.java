package com.hkt.ekyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EkycEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EkycEurekaServerApplication.class, args);
	}
}
