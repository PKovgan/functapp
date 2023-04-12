package com.p.k.functionalapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication(scanBasePackages = "com.p.k.functionalapp")
public class FunctionalappApplication {

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(FunctionalappApplication.class);
	}


	public static void main(String[] args) {
		SpringApplication.run(FunctionalappApplication.class, args);
	}

}
