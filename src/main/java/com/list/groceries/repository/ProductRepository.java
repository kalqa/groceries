package com.list.groceries.repository;

import java.util.List;

import com.list.groceries.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByProductName(String name);
    Product findById(long id);
}
