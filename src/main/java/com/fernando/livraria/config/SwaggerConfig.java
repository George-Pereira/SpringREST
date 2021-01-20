package com.fernando.livraria.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
public class SwaggerConfig 
{
	private static final String TITLE = "Livraria";
	private static final String DESC = "API profissional para Livrarias";
	private static final String VERSION = "V1";
	private static final String DEV = "Fernando George Pereira";
	private static final String SITE = "https://www.github.com/George-Pereira";
	private static final String CONTACT = "George.fpereira06@gmail.com";
	@Bean
	public Docket api() 
	{
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.fernando")).paths(PathSelectors.any()).build().apiInfo(buildApiInfo());
	}

	private ApiInfo buildApiInfo() 
	{
		return new ApiInfoBuilder().title(TITLE).description(DESC).version(VERSION).contact(new Contact(DEV, SITE, CONTACT)).build();
	}
}
