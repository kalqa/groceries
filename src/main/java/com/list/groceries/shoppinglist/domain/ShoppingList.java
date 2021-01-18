package com.list.groceries.shoppinglist.domain;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.list.groceries.listofproducts.domain.ListOfProducts;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "SHOPPINGLIST")
@Getter
@Setter
public
class ShoppingList {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shoppinglist_id")
    private long id;

    private String name;

    @OneToMany(mappedBy = "shoppingList")
    private Set<ListOfProducts> listOfProducts;
}
