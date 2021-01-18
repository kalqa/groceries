package com.list.groceries.shoppinglist.domain;

import com.list.groceries.shoppinglist.domain.dto.ShoppingListDto;

class ShoppingListMapper {

    static ShoppingListDto mapToShoppingListDto(ShoppingList shoppingList) {
        return ShoppingListDto.builder()
                .id(shoppingList.getId())
                .name(shoppingList.getName())
                .build();
    }

    static ShoppingList fromShoppingListDto(ShoppingListDto shoppingListDto) {
        final ShoppingList shoppingList = new ShoppingList();
        shoppingList.setId(shoppingListDto.getId());
        shoppingList.setName(shoppingListDto.getName());
        return shoppingList;
    }
}
