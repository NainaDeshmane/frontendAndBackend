package com.example.demo.service;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Product;

public interface HomeService {
	public Product saveProduct(@RequestBody Product p);
	public Iterable<Product> getProduct();
	public void deleteProduct(Integer productId);
	public Product updateProduct(Integer productId, Product p);
	public Product getProductById(Integer productId);
	

}
