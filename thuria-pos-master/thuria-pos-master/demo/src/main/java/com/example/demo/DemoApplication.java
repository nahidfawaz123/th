package com.example.demo;


import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class DemoApplication {

	public static void main(String[] args) {SpringApplication.run(DemoApplication.class, args);
	}
//	@Bean
//	PasswordEncoder passwordEncoder(){
//		return new BCryptPasswordEncoder();
//	}


}
