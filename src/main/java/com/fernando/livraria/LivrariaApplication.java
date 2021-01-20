package com.fernando.livraria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan("com.fernando.livraria")
@EnableSwagger2

public class LivrariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivrariaApplication.class, args);
	}

}
