package com.example.customerconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class CustomerConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerConfigServerApplication.class, args);
	}

}
