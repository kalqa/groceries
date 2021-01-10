package com.list.groceries.product.domain;

import org.springframework.context.annotation.Bean;

public class ProductConfiguration {

    @Bean
    public ProductFacade productFacade() {


        return new ProductFacade();
    }
}
