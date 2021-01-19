package com.list.groceries.product;

import java.util.List;

import com.list.groceries.product.domain.ProductFacade;
import com.list.groceries.product.domain.dto.ProductDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
@AllArgsConstructor
class ProductController {

    ProductFacade productFacade;

    @GetMapping
    public ResponseEntity<List<ProductDto>> allProducts() {
        return ResponseEntity.ok(productFacade.getAllProducts());
    }

    @PostMapping
    public ProductDto addNewProduct(@RequestBody ProductDto product) {
        return productFacade.addNewProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        productFacade.deleteById(id);
    }
}
