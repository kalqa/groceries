package com.list.groceries.product.domain;

import java.util.List;
import java.util.stream.Collectors;

import com.list.groceries.product.domain.dto.ProductDto;
import lombok.AllArgsConstructor;

import static com.list.groceries.product.domain.ProductDtoMapper.fromProductDto;
import static com.list.groceries.product.domain.ProductDtoMapper.mapToProductDto;

@AllArgsConstructor
public class ProductFacade {

    ProductService productService;

    public List<ProductDto> getAllProducts() {
        return productService.findAllProducts().stream()
                .map(ProductDtoMapper::mapToProductDto)
                .collect(Collectors.toList());
    }

    public ProductDto addNewProduct(ProductDto productDto) {
        final Product product = fromProductDto(productDto);
        return mapToProductDto(productService.save(product));
    }
}
