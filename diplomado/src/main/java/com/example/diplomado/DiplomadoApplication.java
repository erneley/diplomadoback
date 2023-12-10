package com.example.diplomado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DiplomadoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiplomadoApplication.class, args);
	}

	@GetMapping("/")
	public String inicio() {
		return "index";
	}

}
