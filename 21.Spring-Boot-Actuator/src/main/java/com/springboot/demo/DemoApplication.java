package com.springboot.demo;

import com.springboot.demo.beans.DemoBeansTest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoApplication {
	public static Logger mLogger = LoggerFactory.getLogger("ActuatorLogger");

	@Autowired
	private DemoBeansTest mBeansTest;


	@RequestMapping("/")
	String index() {
		return "hello spring boot";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		mLogger.error("Actuator demo application log tag = %s");
	}
}
