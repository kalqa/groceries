package com.list.groceries.product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ProductTestBase {

    protected Product aProduct(String productName) {
        return new Product(productName);
    }

    protected List<Product> aProducts(Product... product) {
        return new ArrayList<>(Arrays.asList(product));
    }
}
