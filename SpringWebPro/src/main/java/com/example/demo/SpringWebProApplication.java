package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
/*
 * @ComponentScan(basePackages =
 * {"com.example.demo.AdminController","com.example.demo.Bean"})
 */
public class SpringWebProApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SpringWebProApplication.class, args);
	}

}
