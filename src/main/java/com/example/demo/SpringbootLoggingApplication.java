package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootLoggingApplication {

	public static void main(String[] args) {
		System.out.println("新建分支文件");
		SpringApplication.run(SpringbootLoggingApplication.class, args);
	}

}
