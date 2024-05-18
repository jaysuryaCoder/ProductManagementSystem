package com.jaysurya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jaysurya.model.Product;
import com.jaysurya.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Integer id) {
		return productRepository.findById(id).get();
	}

	@Override
	public String deleteProduct(Integer id) {
		Product product=productRepository.findById(id).get();
		if(product!=null) {
			productRepository.delete(product);
			return "product deleted successfullly";
		}
		return "Something wrong on server ";
		
	}

}
