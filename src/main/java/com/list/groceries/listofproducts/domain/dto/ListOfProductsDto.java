package com.list.groceries.listofproducts.domain.dto;

import com.list.groceries.product.domain.dto.ProductDto;
import com.list.groceries.shoppinglist.domain.dto.ShoppingListDto;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public
class ListOfProductsDto {

    ProductDto product;
    ShoppingListDto shoppingList;
}
