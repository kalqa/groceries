package com.list.groceries.shoppinglist.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.list.groceries.product.domain.Product;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "SHOPPINGLIST")
@Getter
@Setter
public
class ShoppingList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "shoppinglist_id")
    private long id;

    private String name;

    @ManyToMany
    @JoinTable(
            name = "list_products",
            joinColumns = @JoinColumn(name = "shoppinglist_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> products;
}
