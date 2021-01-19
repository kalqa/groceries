package com.list.groceries.shoppinglist;

import java.util.List;

import com.list.groceries.shoppinglist.domain.ShoppingListFacade;
import com.list.groceries.shoppinglist.domain.dto.ShoppingListDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/shoppingList")
@AllArgsConstructor
class ShoppingListController {

    ShoppingListFacade shoppingListFacade;

    @GetMapping
    public ResponseEntity<List<ShoppingListDto>> findAllShoppingLists() {
        return ResponseEntity.ok(shoppingListFacade.findAllProductLists());
    }

    @PostMapping
    public ShoppingListDto saveNewShoppingList(@RequestBody ShoppingListDto shoppingListDto) {
        return shoppingListFacade.saveNewShoppingList(shoppingListDto);
    }

    @GetMapping("/{listId}")
    public ShoppingListDto findListById(@PathVariable long listId) {
        return shoppingListFacade.findListById(listId);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        shoppingListFacade.deleteById(id);
    }
}
