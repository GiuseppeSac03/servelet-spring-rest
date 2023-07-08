package com.academy.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.academy.entity.Products;
import com.academy.service.ProductService;

@Controller
@RequestMapping
public class SearchController {
	
	@Resource(name="productServiceDefault")
	ProductService productservice;
	
	@GetMapping(value="/search")
	public String search(){
		return "search";
		
	}
	
	@RequestMapping(value="/productline",method = RequestMethod.GET)
	public String searchPl(@RequestParam(name="productline")String productline,Model model) {
		List<Products> products = productservice.getProductByLine(productline);
		System.out.println("productline input -->" + productline);
		System.out.println("trova n prodotti -->" + products.size());
		model.addAttribute("products", products);
		return "search";
		
		
	}
	

}
