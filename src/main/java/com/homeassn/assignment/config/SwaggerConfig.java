package com.homeassn.assignment.config;

import static springfox.documentation.builders.PathSelectors.regex;

import java.util.Collections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.homeassn.assignment"))
        .paths(regex("/rest.*"))
        .build()
        .apiInfo(apiInfo());
  }

  private ApiInfo apiInfo() {
    return new ApiInfo(
        "Sinch Assignment Rest API",
        "This API is responsible for evaluation if arithmetic expressions written in Polish notation",
        "v1.0",
        "Terms of service",
        new Contact("Barath Kumar", "", "barath.k1@gmail.com"),
        "License of API", "API license URL", Collections.emptyList());
  }

}
