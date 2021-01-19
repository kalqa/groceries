package com.list.groceries.listofproducts.domain;

import java.util.List;
import java.util.stream.Collectors;

import com.list.groceries.listofproducts.domain.dto.ListOfProductsDto;
import com.list.groceries.listofproducts.domain.dto.ListOfProductsIdsDto;
import lombok.AllArgsConstructor;

import static com.list.groceries.listofproducts.domain.ListOfProductsMapper.mapFromListOfProductsDto;
import static com.list.groceries.listofproducts.domain.ListOfProductsMapper.mapToListOfProductsDtoIds;

@AllArgsConstructor
public class ListOfProductsFacade {

    ListOfProductsService listOfProductsService;

    public ListOfProductsIdsDto save(ListOfProductsIdsDto listOfProductsIdsDto) {
        final ListOfProducts listOfProducts = mapFromListOfProductsDto(listOfProductsIdsDto);
        return mapToListOfProductsDtoIds(listOfProductsService.save(listOfProducts));
    }

    public List<ListOfProductsDto> findAll() {
        return listOfProductsService.findAll()
                .stream()
                .map(ListOfProductsMapper::mapToListOfProductsDto)
                .collect(Collectors.toList());
    }

    public void deleteById(long id) {
        listOfProductsService.deleteById(id);
    }
}
