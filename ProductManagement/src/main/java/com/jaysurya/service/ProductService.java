package com.jaysurya.service;

import java.util.List;

import com.jaysurya.model.Product;

public interface ProductService {
	
	public Product saveProduct(Product product);
	
	public List<Product> getAllProducts();
	
	public Product getProductById(Integer id);
	
	public String deleteProduct(Integer id);

}
