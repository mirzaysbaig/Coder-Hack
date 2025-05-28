package com.crio.coderHack;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

// Built by Ajinkya Kale
// Crio Assignment
// 10-12-2024

@SpringBootApplication
public class CoderHackApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoderHackApplication.class, args);
	}

	@Bean
	@Scope("prototype")
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}
