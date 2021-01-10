package com.list.groceries.product.domain;

import java.util.List;

public class ProductFacade {

    ProductRepository productRepository;



    public Product show(String name) {
        return productRepository.findByName(name);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product add(Product product) {
        return productRepository.save(product);
    }
}
