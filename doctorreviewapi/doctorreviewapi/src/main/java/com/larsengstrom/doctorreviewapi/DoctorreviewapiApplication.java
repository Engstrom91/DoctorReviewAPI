package com.larsengstrom.doctorreviewapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//The class is marked as a Spring Boot application through this annotation. It is responsible for configuring the beans and scanning for the different components of the application.
@SpringBootApplication
public class DoctorreviewapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DoctorreviewapiApplication.class, args);
	}

}
