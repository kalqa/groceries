package com.list.groceries.listofproducts.domain;

import com.list.groceries.listofproducts.domain.dto.ListOfProductsDto;
import lombok.AllArgsConstructor;

import static com.list.groceries.listofproducts.domain.ListOfProductsMapper.mapFromListOfProductsDto;
import static com.list.groceries.listofproducts.domain.ListOfProductsMapper.mapToListOfProductsDto;

@AllArgsConstructor
public class ListOfProductsFacade {

    ListOfProductsService listOfProductsService;

    public ListOfProductsDto save(ListOfProductsDto listOfProductsDto) {
        final ListOfProducts listOfProducts = mapFromListOfProductsDto(listOfProductsDto);
        return mapToListOfProductsDto(listOfProductsService.save(listOfProducts));
    }
}
