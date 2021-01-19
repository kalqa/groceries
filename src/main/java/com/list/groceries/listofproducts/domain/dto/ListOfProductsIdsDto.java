package com.list.groceries.listofproducts.domain.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public
class ListOfProductsIdsDto {

    long product;
    long shoppingList;
}
