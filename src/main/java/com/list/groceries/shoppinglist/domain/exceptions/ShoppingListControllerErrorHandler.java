package com.list.groceries.shoppinglist.domain.exceptions;

import com.list.groceries.error.Error;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ShoppingListControllerErrorHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ShoppingListNotFoundException.class)
    public Error productNotFound(ShoppingListNotFoundException e) {
        final long shoppingListId = e.getShoppingListId();
        return new Error("Shopping list with id " + shoppingListId + " not found");
    }
}
