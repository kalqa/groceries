package com.list.groceries.shoppinglist.domain;

import java.util.List;
import java.util.stream.Collectors;

import com.list.groceries.shoppinglist.domain.dto.ShoppingListDto;
import lombok.AllArgsConstructor;

import static com.list.groceries.shoppinglist.domain.ShoppingListMapper.fromShoppingListDto;
import static com.list.groceries.shoppinglist.domain.ShoppingListMapper.mapToShoppingListDto;

@AllArgsConstructor
public class ShoppingListFacade {

    ShoppingListService shoppingListService;

    public List<ShoppingListDto> findAllProductLists() {
        return shoppingListService.findAllProductLists().stream()
                .map(ShoppingListMapper::mapToShoppingListDto)
                .collect(Collectors.toList());
    }

    public ShoppingListDto saveNewShoppingList(ShoppingListDto shoppingListDto) {
        final ShoppingList shoppingList = fromShoppingListDto(shoppingListDto);
        return mapToShoppingListDto(shoppingListService.save(shoppingList));
    }
}
