package com.list.groceries.list.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ShoppingListConfiguration {

    @Bean
    ShoppingListFacade productFacade(ShoppingListRepository shoppingListRepository) {
        ShoppingListService shoppingListService = new ShoppingListService(shoppingListRepository);
        return new ShoppingListFacade(shoppingListService);
    }
}
