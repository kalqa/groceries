package com.list.groceries.product.domain.exceptions;

import lombok.Getter;

@Getter
public class ProductNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -7367511918105935481L;
    private final long productId;

    public ProductNotFoundException(long productId) {
        this.productId = productId;
    }
}
