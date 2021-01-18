package com.list.groceries.listofproducts.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class ListOfProductsConfiguration {

    @Bean
    ListOfProductsFacade listOfProductsFacade(ListOfProductsRepository repository) {
        ListOfProductsService service = new ListOfProductsService(repository);
        return new ListOfProductsFacade(service);
    }
}
