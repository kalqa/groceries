package com.list.groceries.product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.list.groceries.product.domain.Product;

public abstract class ProductTestBase {

    protected Product aProduct(String productName, Double price) {
        return new Product(productName, price);
    }

    protected Product aBread(){
        return aProduct("Chleb", 2.55);
    }

    protected Product aMeat(){
        return aProduct("Mieso", 3.22);
    }

    protected List<Product> aProducts(Product... product) {
        return new ArrayList<>(Arrays.asList(product));
    }
}
