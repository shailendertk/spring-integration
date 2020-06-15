package com.shasha.poc.springintg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource ("classpath:http-outbound-gateway.xml")
public class SpringIntgBootApp {

	public static void main(String[] args) {
		SpringApplication.run(SpringIntgBootApp.class, args);
	}

}
