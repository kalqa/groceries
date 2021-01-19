package com.list.groceries.shoppinglist.domain.dto;

import javax.validation.constraints.NotBlank;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class ShoppingListDto {

    private final long id;

    @NotBlank(message = "Name is mandatory")
    private final String name;
}
