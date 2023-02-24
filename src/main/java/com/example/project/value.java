package com.example.project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class value {
	@Value("JYOTHIRAAM")
	private String name;
	@GetMapping("/val")
	public String val() {
		return "Welcome "+name;
	}
}