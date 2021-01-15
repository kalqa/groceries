package com.list.groceries.list.domain;

import com.list.groceries.list.domain.dto.ShoppingListDto;

class ShoppingListMapper {

    static ShoppingListDto mapToProductDto(ShoppingList shoppingList) {
        return ShoppingListDto.builder()
                .name(shoppingList.getName())
                .build();
    }

    static ShoppingList fromProductDto(ShoppingListDto shoppingList) {
        return new ShoppingList(shoppingList.getId(), shoppingList.getName());
    }
}
