package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.HomeService;
import com.example.demo.serviceimp.HomeServiceImpl;

@CrossOrigin("*")
@RequestMapping("/Product")
@RestController
public class HomeController {
	@Autowired
	HomeService hs;
	
	
	
	@PostMapping("/Product")
	public Product saveProduct(@RequestBody Product p) {
		return hs.saveProduct(p);
	}
	
	@GetMapping("/Products")
	public Iterable <Product> getProduct(){
		Iterable<Product> ls=hs.getProduct();
		return ls;
	}
	@GetMapping("/Product/{productId}")
	public Product getProductById(@PathVariable Integer productId) {
		return hs.getProductById(productId);
		
	}
	
	@DeleteMapping("/Product/{productId}")
	public String deleteProductById(@PathVariable Integer productId) {
			hs.deleteProduct(productId);
			return "Product Deleted";
	}
	
	@PutMapping("/Product/{productId}")
	public Product updateProduct(@PathVariable Integer productId, @RequestBody Product p) {
		Product product= hs.updateProduct(productId,p);
		return product;
		
	}

}
