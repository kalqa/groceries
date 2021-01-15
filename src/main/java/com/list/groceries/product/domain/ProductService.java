package com.list.groceries.product.domain;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
class ProductService {

    ProductRepository productRepository;

    ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    Product addNewProduct(Product product) {
        return productRepository.save(product);
    }
}