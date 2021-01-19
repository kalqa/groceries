package com.list.groceries.listofproducts.domain;

import java.util.List;

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

    List<ListOfProducts> findAll() {
        return repository.findAll();
    }
}
