package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	@Id
	 public Integer productId;
	 public String productName;
	 public String productType;
	 public Double productPrice;
	 

}
