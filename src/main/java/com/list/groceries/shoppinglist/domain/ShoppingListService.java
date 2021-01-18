package com.list.groceries.shoppinglist.domain;

import java.util.List;
import java.util.Optional;

import com.list.groceries.product.domain.Product;
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

    public ShoppingList findListById(long listId) {
        return shoppingListRepository.findById(listId)
                .orElseThrow(IllegalStateException::new);
    }

}
