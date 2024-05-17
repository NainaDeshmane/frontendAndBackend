package com.example.demo.serviceimp;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Product;
import com.example.demo.repository.HomeRepository;
import com.example.demo.service.HomeService;

@Service
public class HomeServiceImpl implements HomeService{
	@Autowired
	HomeRepository hr;

	@Override
	public Product saveProduct(@RequestBody Product p) {
		Product pro= hr.save(p);
		return pro;
	}

	public Iterable<Product> getProduct() {
		Iterable<Product> lp=hr.findAll();
		return lp;
	}

	@Override
	public void deleteProduct(Integer productId) {
		hr.deleteById(productId);
		
	}

	@Override
	public Product updateProduct(Integer productId, Product p) {
		Optional<Product> op= hr.findById(productId);
		
		if(op.isPresent())
		{
			Product product=op.get();
			if(p.getProductName()!=null) {
			product.setProductName(p.getProductName());
			}
			if(p.getProductType()!=null) {
				product.setProductType(p.getProductType());
			}
			if(p.getProductPrice()!=null) {
				product.setProductPrice(p.getProductPrice());
			}
			return hr.save(product);
			
		}
		
		return null;
	}

	@Override
	public Product getProductById(Integer productId) {
		
		Product pro= hr.findById(productId).get();
		 return pro;
		
		
	}

	
	

}
