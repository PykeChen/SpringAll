package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import tk.mybatis.spring.annotation.MapperScan;


@SpringBootApplication
@MapperScan("com.springboot.mapper")
public class Application {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class,args);
		

	}

}
