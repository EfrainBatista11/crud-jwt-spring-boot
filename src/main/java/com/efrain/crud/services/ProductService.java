package com.efrain.crud.services;

import java.util.List;
import java.util.Optional;

import com.efrain.crud.entities.Product;

public interface ProductService {

    List<Product> findAll();

    Optional<Product> findById(Long id);
    
    Product save(Product product);

    Optional<Product> update(Long id, Product product);

    Optional<Product> delete(Long id);

    Boolean existsBySku(String sku);
}
