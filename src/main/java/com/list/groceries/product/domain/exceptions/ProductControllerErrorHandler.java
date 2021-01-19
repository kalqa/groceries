package com.list.groceries.product.domain.exceptions;

import com.list.groceries.error.Error;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ProductControllerErrorHandler {

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ProductNotFoundException.class)
    public Error productNotFound(ProductNotFoundException e) {
        final long productId = e.getProductId();
        return new Error("Product with id " + productId + " not found");
    }
}
