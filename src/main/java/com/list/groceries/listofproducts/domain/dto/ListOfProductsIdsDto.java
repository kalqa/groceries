package com.list.groceries.listofproducts.domain.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ListOfProductsIdsDto {

    private final long id;
    private final long product;
    private final long shoppingList;
}
