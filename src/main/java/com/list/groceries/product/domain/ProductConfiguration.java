package com.list.groceries.product.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ProductConfiguration {

    @Bean
    ProductFacade productFacade(ProductRepository productRepository, ProductService productService) {
        return new ProductFacade(productRepository, productService);
    }
}
