package com.example.demo;


import com.example.demo.test.ComConfTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	ComConfTest comTest;
	

	@Test
	public void contextLoads() {

//		ComConfTest comTest = (ComConfTest) BeanUtils.getBean("comConfTest");
//		ComConfTest comTest = BeanUtils.getBean(ComConfTest.class);

		System.out.println("test1-country = "  + comTest.country + ", test2-country "  + comTest.country);
//		boolean result = test1.country == test2.country;
//		System.out.println(result ? "======同一个country" : "=====不同的country");
	}

}
