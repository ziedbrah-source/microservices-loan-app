package com.alibou.databaseserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class DatabaseServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatabaseServerApplication.class, args);
	}

}
