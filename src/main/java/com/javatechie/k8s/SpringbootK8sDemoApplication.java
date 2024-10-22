package com.javatechie.k8s;

import io.opentelemetry.exporter.otlp.trace.OtlpGrpcSpanExporter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class SpringbootK8sDemoApplication {
	@Autowired
	private Config config;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/message")
	public String displayMessage(){
		System.out.println("......" + config.getName());
		System.out.println(restTemplate.getForEntity("https://api.restful-api.dev/objects", String.class));
		return "Congratulation you successfully deployed your application to kubernetes !!" + config.getGroup();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sDemoApplication.class, args);
	}

}
