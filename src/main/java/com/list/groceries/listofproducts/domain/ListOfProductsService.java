package com.list.groceries.listofproducts.domain;

import org.springframework.stereotype.Service;

@Service
class ListOfProductsService {

    ListOfProductsRepository repository;

    public ListOfProductsService(ListOfProductsRepository repository) {
        this.repository = repository;
    }

    ListOfProducts save(ListOfProducts listOfProducts) {
        return repository.save(listOfProducts);
    }
}
