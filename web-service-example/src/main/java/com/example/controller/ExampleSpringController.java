package com.example.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/spring")
public class ExampleSpringController {

	@GetMapping
	public ResponseEntity<String> get() {
		return new ResponseEntity<String>("{ \"service\" : \"spring-web-service\" }", HttpStatus.OK);
	}
	
}
