package com.list.groceries.product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class ProductTestBase {

    protected Product aProduct(String productName, Double price) {
        return new Product(productName, price);
    }

    public Product aChleb(){
        return aProduct("Chleb", 2.55);
    }

    public Product aMieso(){
        return aProduct("Mieso", 3.22);
    }

    protected List<Product> aProducts(Product... product) {
        return new ArrayList<>(Arrays.asList(product));
    }
}