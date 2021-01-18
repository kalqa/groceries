package com.list.groceries.product.domain;

import java.util.List;
import java.util.stream.Collectors;

import com.list.groceries.product.domain.dto.ProductDto;

public class ProductDtoMapper {

    public static ProductDto mapToProductDto(Product product) {
        return ProductDto.builder()
                .name(product.getName())
                .price(product.getPrice())
                .build();
    }

    public static Product fromProductDto(ProductDto productDto) {
        return Product.builder()
                .id(productDto.getId())
                .name(productDto.getName())
                .price(productDto.getPrice())
                .build();
    }

    public static List<Product> mapProductsToDto(List<ProductDto> products) {
        return products.stream()
                .map(ProductDtoMapper::fromProductDto)
                .collect(Collectors.toList());
    }
}
