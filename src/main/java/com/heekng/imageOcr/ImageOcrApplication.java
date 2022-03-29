package com.heekng.imageOcr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ImageOcrApplication {
	static String PROPERTIES = "spring.config.location=classpath:/application.yml,classpath:/naverApi.yml";

	public static void main(String[] args) {
//		SpringApplication.run(ImageOcrApplication.class, args);
		new SpringApplicationBuilder(ImageOcrApplication.class)
				.properties(PROPERTIES)
				.run(args);
	}

}
