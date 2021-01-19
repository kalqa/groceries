package com.list.groceries.listofproducts.domain.exceptions;

import lombok.Getter;

@Getter
public class ListOfProductsNotFoundException extends RuntimeException {

    private static final long serialVersionUID = -7367511918105935481L;
    private final long listOfProductsId;

    public ListOfProductsNotFoundException(long listOfProductsId) {
        this.listOfProductsId = listOfProductsId;
    }
}
