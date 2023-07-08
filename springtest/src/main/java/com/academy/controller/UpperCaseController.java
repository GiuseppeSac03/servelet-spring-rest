package com.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value ="/uppercase")
public class UpperCaseController {
	
	@GetMapping
	public String toUpperCase(@RequestParam(name="name", required = false) String parola,Model model){
		
				
		String strUpperCase = parola.toUpperCase();
	
		model.addAttribute("StringaUppercase",strUpperCase);
		return "page2";
	}

}
