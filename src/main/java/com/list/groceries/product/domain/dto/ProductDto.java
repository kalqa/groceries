package com.list.groceries.product.domain.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductDto {

    private final String name;
    private final Double price;
}
