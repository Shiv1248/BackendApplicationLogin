package com.green;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GreenStitchApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreenStitchApplication.class, args);
		System.out.println("Hi Shivansh! This application is running!");
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
