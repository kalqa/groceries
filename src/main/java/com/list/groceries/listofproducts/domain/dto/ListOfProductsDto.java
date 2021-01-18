package com.list.groceries.listofproducts.domain.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public
class ListOfProductsDto {

    long product;
    long shoppingList;
}
