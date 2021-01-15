package com.list.groceries.list;

import java.util.List;

import com.list.groceries.list.domain.ShoppingListFacade;
import com.list.groceries.list.domain.dto.ShoppingListDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/shoppingList")
@AllArgsConstructor
public class ShoppingListController {

    ShoppingListFacade shoppingListFacade;

    @GetMapping
    public ResponseEntity<List<ShoppingListDto>> allProducts() {
        return ResponseEntity.ok(shoppingListFacade.findAllProductLists());
    }

    @PostMapping
    public ShoppingListDto addNewProduct(@RequestBody ShoppingListDto shoppingListDto) {
        return shoppingListFacade.addNewShoppingList(shoppingListDto);
    }
}
