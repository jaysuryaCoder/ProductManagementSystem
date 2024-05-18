package com.jaysurya.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaysurya.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
