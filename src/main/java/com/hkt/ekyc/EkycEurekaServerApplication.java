package com.hkt.ekyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.boot.system.ApplicationPidFileWriter;

@EnableEurekaServer
@SpringBootApplication
public class EkycEurekaServerApplication {

	public static void main(String[] args) {
		 SpringApplication springApplication = new SpringApplication(EkycEurekaServerApplication.class);
		springApplication.addListeners(new ApplicationPidFileWriter()); 
		springApplication.run(args);
	        
	}
}
