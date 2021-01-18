package com.list.groceries.shoppinglist.domain;

import com.list.groceries.shoppinglist.domain.dto.ShoppingListDto;
import com.list.groceries.product.domain.ProductDtoMapper;

class ShoppingListMapper {

    static ShoppingListDto mapToShoppingListDto(ShoppingList shoppingList) {
        return ShoppingListDto.builder()
                .name(shoppingList.getName())
                .build();
    }

    static ShoppingList fromShoppingListDto(ShoppingListDto shoppingList) {
        return ShoppingList.builder()
                .id(shoppingList.getId())
                .name(shoppingList.getName())
                .products(ProductDtoMapper.mapProductsToDto(shoppingList.getProducts()))
                .build();
    }
}
