package com.list.groceries.shoppinglist.domain.exceptions;

import lombok.Getter;

@Getter
public class ShoppingListNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -7367511918105935481L;
    private final long shoppingListId;

    public ShoppingListNotFoundException(long shoppingListId) {
        this.shoppingListId = shoppingListId;
    }
}
