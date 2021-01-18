package com.list.groceries.listofproducts;

import com.list.groceries.listofproducts.domain.ListOfProductsFacade;
import com.list.groceries.listofproducts.domain.dto.ListOfProductsDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/listofproducts")
@AllArgsConstructor
class ListOfProductsController {

    ListOfProductsFacade facade;

    @PostMapping
    public ListOfProductsDto addNewListOfProducts(@RequestBody ListOfProductsDto listOfProductsDto) {
        return facade.save(listOfProductsDto);
    }
}
