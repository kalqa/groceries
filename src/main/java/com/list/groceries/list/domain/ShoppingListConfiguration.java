package com.list.groceries.list.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ShoppingListConfiguration {

    @Bean
    ShoppingListFacade shoppingListFacade(ShoppingListRepository shoppingListRepository) {
        ShoppingListService shoppingListService = new ShoppingListService(shoppingListRepository);
        return new ShoppingListFacade(shoppingListService);
    }
}
