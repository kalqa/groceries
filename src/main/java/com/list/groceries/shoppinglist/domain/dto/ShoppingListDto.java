package com.list.groceries.shoppinglist.domain.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ShoppingListDto {

    private final Long id;
    private final String name;
}
