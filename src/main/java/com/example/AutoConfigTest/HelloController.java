package com.example.AutoConfigTest;

import org.springframework.web.bind.annotation.RestController;

import com.baeldung.greeter.autoconfigure.Greeter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
	
    @Autowired
	private Greeter greeter; 

	@RequestMapping("/")
	public String index() {
		
		String message = greeter.greet();
		return "Spring Boot Greeting ... " + message;
	}

}
