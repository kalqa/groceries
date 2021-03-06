package com.list.groceries.listofproducts;

import java.util.List;

import javax.validation.Valid;

import com.list.groceries.listofproducts.domain.ListOfProductsFacade;
import com.list.groceries.listofproducts.domain.dto.ListOfProductsDto;
import com.list.groceries.listofproducts.domain.dto.ListOfProductsIdsDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public ListOfProductsIdsDto addNewListOfProducts(@Valid @RequestBody ListOfProductsIdsDto listOfProductsIdsDto) {
        return facade.save(listOfProductsIdsDto);
    }

    @GetMapping
    public List<ListOfProductsDto> findAllListOfProducts() {
        return facade.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable long id) {
        facade.deleteById(id);
    }
}
