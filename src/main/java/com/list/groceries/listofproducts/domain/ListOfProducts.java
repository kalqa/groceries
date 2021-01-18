package com.list.groceries.listofproducts.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.list.groceries.product.domain.Product;
import com.list.groceries.shoppinglist.domain.ShoppingList;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public
class ListOfProducts {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "shoppinglist_id")
    private ShoppingList shoppingList;
}
