package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
	@GetMapping
	public String Welcome() {
		return "Welcome Spring Boot!";
	}

}
