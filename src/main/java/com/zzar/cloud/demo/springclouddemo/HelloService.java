package com.zzar.cloud.demo.springclouddemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello";
	}
}
