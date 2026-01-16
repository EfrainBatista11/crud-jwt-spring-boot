package com.efrain.crud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.efrain.crud.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{
	
    boolean existsBySku(String sku);
    
}
