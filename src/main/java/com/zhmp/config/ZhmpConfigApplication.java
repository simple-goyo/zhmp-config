package com.zhmp.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableConfigServer
public class ZhmpConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZhmpConfigApplication.class, args);
	}
}
