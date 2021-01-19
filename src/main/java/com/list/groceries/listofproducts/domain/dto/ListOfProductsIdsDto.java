package com.list.groceries.listofproducts.domain.dto;

import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ListOfProductsIdsDto {

    private final long id;

    @NotNull
    private final Long product;

    @NotNull
    private final Long shoppingList;
}
