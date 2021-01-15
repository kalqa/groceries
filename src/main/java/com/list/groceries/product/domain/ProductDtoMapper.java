package com.list.groceries.product.domain;

import com.list.groceries.product.domain.dto.ProductDto;

class ProductDtoMapper {

    static ProductDto mapToProductDto(Product product) {
        return ProductDto.builder()
                .name(product.getName())
                .price(product.getPrice())
                .build();
    }

    static Product fromProductDto(ProductDto productDto) {
        return new Product(productDto.getId(), productDto.getName(), productDto.getPrice());
    }
}
