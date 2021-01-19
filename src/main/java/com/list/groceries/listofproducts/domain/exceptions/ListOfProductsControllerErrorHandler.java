package com.list.groceries.listofproducts.domain.exceptions;

import com.list.groceries.error.Error;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ListOfProductsControllerErrorHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ListOfProductsNotFoundException.class)
    public Error productNotFound(ListOfProductsNotFoundException e) {
        final long listOfProductsId = e.getListOfProductsId();
        return new Error("List of products with id " + listOfProductsId + " not found");
    }
}
