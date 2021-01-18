package com.list.groceries.listofproducts.domain;

import com.list.groceries.listofproducts.domain.dto.ListOfProductsDto;
import com.list.groceries.product.domain.Product;
import com.list.groceries.shoppinglist.domain.ShoppingList;

public class ListOfProductsMapper {

    public static ListOfProducts mapFromListOfProductsDto(ListOfProductsDto listOfProductsDto) {
        final ListOfProducts listOfProducts = new ListOfProducts();
        final Product product = new Product();
        final ShoppingList shoppingList = new ShoppingList();
        product.setId(listOfProductsDto.getProduct());
        shoppingList.setId(listOfProductsDto.getShoppingList());
        listOfProducts.setProduct(product);
        listOfProducts.setShoppingList(shoppingList);
        return listOfProducts;
    }

    public static ListOfProductsDto mapToListOfProductsDto(ListOfProducts save) {
        return ListOfProductsDto.builder()
                .shoppingList(save.getShoppingList().getId())
                .product(save.getProduct().getId())
                .build();
    }
}
