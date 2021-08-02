package com.trg.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@ComponentScan(basePackages = {"com.trg.student"})
@EnableSwagger2
public class SpringbootdatajpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootdatajpaApplication.class, args);
	}

}
