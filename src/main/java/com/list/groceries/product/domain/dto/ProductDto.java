package com.list.groceries.product.domain.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductDto {

    private String name;
    private Double price;
}
