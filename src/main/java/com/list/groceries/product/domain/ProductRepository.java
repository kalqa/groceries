package com.list.groceries.product.domain;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ProductRepository extends JpaRepository<Product, Long> {

    Product findByName(String name);
    List<Product> findAllByProductLists_id(long shoppinglistId);
}
