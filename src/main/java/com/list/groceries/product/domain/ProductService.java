package com.list.groceries.product.domain;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
class ProductService {

    ProductRepository productRepository;

    ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    List<Product> findAllProducts() {
        return productRepository.findAll();
    }

    Product save(Product product) {
        return productRepository.save(product);
    }

    public void deleteById(long id) {
        productRepository.deleteById(id);
    }
}