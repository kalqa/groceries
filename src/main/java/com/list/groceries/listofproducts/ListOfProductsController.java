package com.list.groceries.listofproducts;

import java.util.List;

import com.list.groceries.listofproducts.domain.ListOfProducts;
import com.list.groceries.listofproducts.domain.ListOfProductsFacade;
import com.list.groceries.listofproducts.domain.dto.ListOfProductsDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/listofproducts")
@AllArgsConstructor
class ListOfProductsController {

    ListOfProductsFacade facade;

    @PostMapping
    public ListOfProductsDto addNewListOfProducts(@RequestBody ListOfProductsDto listOfProductsDto) {
        return facade.save(listOfProductsDto);
    }

    @GetMapping
    public List<ListOfProducts> findAllListOfProducts() {
        return facade.findAll();
    }
}
