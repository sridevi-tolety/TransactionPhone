package com.users.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.users.ribbon")
@EnableEurekaClient
public class TranactiOnPhoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(TranactiOnPhoneApplication.class, args);
	}

}
