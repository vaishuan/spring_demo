package com.amdocs.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demo {
	@GetMapping("/in")
	public String show() {
		return "welcome to spring boot and jenkins";
	}

}
