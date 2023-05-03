package com.alibou.creditShower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class CreditShowerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CreditShowerApplication.class, args);
	}

}
