package com.springboot.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.SpyTest;
import com.springboot.annotation.Log;
import com.springboot.util.HttpContextUtils;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {

	@Log("执行方法一")
	@GetMapping("/one")
	public void methodOne(String name) {
		
	}

	@Log("执行方法二")
	@GetMapping("/two")
	public void methodTwo(HttpSession session, Model model, SpyTest spy) throws InterruptedException {
		System.out.println("===> session = " + session + " model " + model + ", SpyTest = " + spy.id + ", customId = " + spy.customId);
		Thread.sleep(2000);
	}

	@Log("执行方法三")
	@GetMapping("/three")
	public void methodThree(String name, String age) {
		
	}
}
