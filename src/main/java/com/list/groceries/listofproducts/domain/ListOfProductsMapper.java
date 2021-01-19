package com.list.groceries.listofproducts.domain;

import com.list.groceries.listofproducts.domain.dto.ListOfProductsDto;
import com.list.groceries.listofproducts.domain.dto.ListOfProductsIdsDto;
import com.list.groceries.product.domain.Product;
import com.list.groceries.product.domain.ProductDtoMapper;
import com.list.groceries.shoppinglist.domain.ShoppingList;
import com.list.groceries.shoppinglist.domain.ShoppingListMapper;

public class ListOfProductsMapper {

    public static ListOfProducts mapFromListOfProductsDto(ListOfProductsIdsDto listOfProductsIdsDto) {
        final ListOfProducts listOfProducts = new ListOfProducts();
        final Product product = new Product();
        final ShoppingList shoppingList = new ShoppingList();
        product.setId(listOfProductsIdsDto.getProduct());
        shoppingList.setId(listOfProductsIdsDto.getShoppingList());
        listOfProducts.setProduct(product);
        listOfProducts.setShoppingList(shoppingList);
        return listOfProducts;
    }

    public static ListOfProductsIdsDto mapToListOfProductsDtoIds(ListOfProducts list) {
        return ListOfProductsIdsDto.builder()
                .shoppingList(list.getShoppingList().getId())
                .product(list.getProduct().getId())
                .build();
    }

    public static ListOfProductsDto mapToListOfProductsDto(ListOfProducts list) {
        return ListOfProductsDto.builder()
                .shoppingList(ShoppingListMapper
                        .mapToShoppingListDto(list.getShoppingList()))
                .product(ProductDtoMapper.mapToProductDto(list.getProduct()))
                .build();
    }
}
