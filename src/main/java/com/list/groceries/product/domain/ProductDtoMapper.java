package com.list.groceries.product.domain;

import com.list.groceries.product.domain.dto.ProductDto;

public class ProductDtoMapper {

    public static ProductDto mapToProductDto(Product product) {
        return ProductDto.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .build();
    }

    public static Product fromProductDto(ProductDto productDto) {
        final Product product = new Product();
        product.setId(productDto.getId());
        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        return product;
    }
}
