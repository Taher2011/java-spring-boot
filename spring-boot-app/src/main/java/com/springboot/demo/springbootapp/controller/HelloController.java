package com.springboot.demo.springbootapp.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

	@Value("${developer.name}")
	private String developerName;

	@Value("${developer.company}")
	private String developerCompany;

	@GetMapping("/time")
	public String getTime() {
		return "Current time on server is " + LocalDateTime.now();
	}

	@GetMapping("/details")
	//@RequestMapping(value="/details", method=RequestMethod.GET)
	public String getdetails() {
		return "Developer Name is " + this.developerName + " and Company is " + this.developerCompany;
	}

}
