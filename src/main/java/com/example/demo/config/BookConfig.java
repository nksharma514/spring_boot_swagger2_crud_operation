package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2

public class BookConfig {

	@Bean
	public Docket postsApi() {
		return new Docket(DocumentationType.SWAGGER_2).groupName("Naren Sharma").apiInfo(apiInfo()).select()
				.paths(regex("/book.*")).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("Book Service")
				.description("Sample Documentation Generateed Using SWAGGER2 for our Book Rest API")
				.termsOfServiceUrl(" Any things as your requirment ").license("Java_Gyan_Mantra License")
				.licenseUrl("any things as your requirment").version("1.0").build();
	}

}
