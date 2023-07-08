package com.academy.service;

import java.util.List;

import com.academy.entity.Products;



public interface ProductService {
	
	List<Products> getProductByLine(String lineCode);
	
	List<Products> getProductsOrderedByCode(int offset, int limit);

}
