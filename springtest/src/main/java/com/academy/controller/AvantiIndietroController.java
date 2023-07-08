package com.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/es5")
public class AvantiIndietroController {
	
	@GetMapping
	public String avanti() {
		return "page6";
	}
	
	@GetMapping(value = "/indietro")
	public String indietro() {
		return "page7";
	}
	
}
