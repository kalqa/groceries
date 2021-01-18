package com.list.groceries.shoppinglist.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.list.groceries.product.domain.Product;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "SHOPPINGLIST")
@Getter
@Setter
class ShoppingList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    @OneToMany
    @JoinColumn(name = "id")
    private List<Product> products;
}
