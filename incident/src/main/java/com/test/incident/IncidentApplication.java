package com.test.incident;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class IncidentApplication {

	public static void main(String[] args) {
		SpringApplication.run(IncidentApplication.class, args);
	}

	@GetMapping("/incident")
	public ResponseEntity<String> hello() {
		return new ResponseEntity<>("Incident Management", HttpStatus.OK);
	}

}
