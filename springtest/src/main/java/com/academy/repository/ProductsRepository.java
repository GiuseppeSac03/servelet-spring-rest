package com.academy.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.academy.entity.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer>{
	@Query("SELECT P FROM Products P WHERE P.productline = :lineCode")
	List<Products> searchByProductLine(String lineCode);
	
}