package com.deploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SukanyaDeploymentApplication {

	public static void main(String[] args) {
		System.out.println("Hello Deployment!!!");
		SpringApplication.run(SukanyaDeploymentApplication.class, args);
	}

}
