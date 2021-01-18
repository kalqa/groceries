package com.list.groceries.shoppinglist.domain.dto;

import java.util.List;

import com.list.groceries.product.domain.dto.ProductDto;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ShoppingListDto {

    private final Long id;
    private final String name;
    private final List<ProductDto> products;
}
