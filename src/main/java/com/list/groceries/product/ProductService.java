package com.list.groceries.product;

import java.util.List;

import com.list.groceries.product.domain.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product addNewProduct(Product product) {
        return productRepository.save(product);
    }
}