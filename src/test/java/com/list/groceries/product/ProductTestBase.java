package com.list.groceries.product;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.list.groceries.product.domain.dto.ProductDto;

public abstract class ProductTestBase {

    protected ProductDto aProduct(String productName, Double price) {
        return ProductDto.builder().name(productName)
                .price(price).build();
    }

    public ProductDto aChleb() {
        return aProduct("Chleb", 2.55);
    }

    public ProductDto aMieso() {
        return aProduct("Mieso", 3.22);
    }

    protected List<ProductDto> aProducts(ProductDto... product) {
        return new ArrayList<>(Arrays.asList(product));
    }
}
