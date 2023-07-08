package com.academy.controller;
import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.academy.entity.Products;

import com.academy.service.ProductService;

@Controller
@RequestMapping (value ="/")
public class HomePageController {
	
	@Resource(name="productServiceDefault")
	ProductService productservice;
	
	@GetMapping
	public String unspecified(Model model){
		
		List<Products> prodotti = productservice.getProductsOrderedByCode(0, 10);
		
		model.addAttribute("products", prodotti);
		return "homepage";
	}

}
