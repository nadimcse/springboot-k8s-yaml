package com.javatechie.k8s;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootK8sDemoApplication {
	@Autowired
	private Config config;

	@GetMapping("/message")
	public String displayMessage(){
		System.out.println("......" + config.getName());
		return "Congratulation you successfully deployed your application to kubernetes !!" + config.getGroup();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sDemoApplication.class, args);
	}

}
