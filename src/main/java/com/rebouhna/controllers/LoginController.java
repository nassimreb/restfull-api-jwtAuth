package com.rebouhna.controllers;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class LoginController {
	
	@RequestMapping("/")
	String home() {
		return "Hello nassim";
	}
}
