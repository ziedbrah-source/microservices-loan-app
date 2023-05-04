package com.alibou.clientapplicationservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ClientApplicationServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientApplicationServiceApplication.class, args);
	}

}
