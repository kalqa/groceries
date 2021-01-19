package com.list.groceries.product.domain.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ProductDto {

    private final Long id;

    @NotBlank(message = "Name is mandatory")
    private final String name;

    @NotNull(message = "Price is mandatory")
    private final Double price;
}
