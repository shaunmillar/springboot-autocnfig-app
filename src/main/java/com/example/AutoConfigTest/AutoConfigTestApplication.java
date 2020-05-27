package com.example.AutoConfigTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//public class AutoConfigTestApplication implements CommandLineRunner {
public class AutoConfigTestApplication  {
	
	//@Autowired
	//private Greeter greeter; 

	public static void main(String[] args) {
		SpringApplication.run(AutoConfigTestApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		String message = greeter.greet();
//		System.out.println(message);
//	}

}
