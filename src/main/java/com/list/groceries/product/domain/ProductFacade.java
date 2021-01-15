package com.list.groceries.product.domain;

import java.util.List;

import com.list.groceries.product.domain.dto.ProductDto;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ProductFacade {

    ProductRepository productRepository;
    ProductService productService;

    public List<ProductDto> getAllProducts() {
        throw new IllegalStateException("Not yet implemented");
    }

    public ProductDto addNewProduct(ProductDto product) {
        throw new IllegalStateException("Not yet implemented");
    }
}
