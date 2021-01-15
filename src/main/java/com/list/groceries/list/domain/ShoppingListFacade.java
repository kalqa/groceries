package com.list.groceries.list.domain;

import java.util.List;
import java.util.stream.Collectors;

import com.list.groceries.list.domain.dto.ShoppingListDto;
import lombok.AllArgsConstructor;

import static com.list.groceries.list.domain.ShoppingListMapper.fromProductDto;
import static com.list.groceries.list.domain.ShoppingListMapper.mapToProductDto;

@AllArgsConstructor
public class ShoppingListFacade {

    ShoppingListService shoppingListService;

    public List<ShoppingListDto> findAllProductLists() {
        return shoppingListService.findAllProductLists().stream()
                .map(ShoppingListMapper::mapToProductDto)
                .collect(Collectors.toList());
    }

    public ShoppingListDto addNewShoppingList(ShoppingListDto shoppingListDto) {
        final ShoppingList shoppingList = fromProductDto(shoppingListDto);
        return mapToProductDto(shoppingListService.save(shoppingList));
    }
}
