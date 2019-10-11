package com.itszt.druiddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DruidDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DruidDemoApplication.class, args);
	}

}
