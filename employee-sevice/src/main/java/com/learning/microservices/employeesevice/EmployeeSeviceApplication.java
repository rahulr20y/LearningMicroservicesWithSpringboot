package com.learning.microservices.employeesevice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EmployeeSeviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSeviceApplication.class, args);
	}

}
