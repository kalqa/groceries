package com.list.groceries.list.domain;

import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
class ShoppingListService {

    ShoppingListRepository shoppingListRepository;

    List<ShoppingList> findAllProductLists() {
        return shoppingListRepository.findAll();
    }

    public ShoppingList save(ShoppingList shoppingList) {
        return shoppingListRepository.save(shoppingList);
    }
}