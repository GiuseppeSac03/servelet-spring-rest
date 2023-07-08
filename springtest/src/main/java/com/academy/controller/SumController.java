package com.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/dosum")
public class SumController {
	
	
	@GetMapping
	public String somma(@RequestParam(name="n1", required = false) int num1,@RequestParam(name="n2", required = false) int num2,Model model) {
		
		int n1 = num1;
		int n2 = num2;
		int somma = n1 + n2;
		
		model.addAttribute("somma", somma);
		return "page4";
	}
	

	

}
