package com.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/ajax")
public class AjaxController {
	
	@GetMapping
	public String ajax() {
		return "ajax";
	}
	
	// @RestMapping

}
