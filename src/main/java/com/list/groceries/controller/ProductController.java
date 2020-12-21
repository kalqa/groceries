package com.list.groceries.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @GetMapping(produces = "application/json")
    public ResponseEntity<Void> allProducts() {
        return ResponseEntity.ok().build();
    }
}
