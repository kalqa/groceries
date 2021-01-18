package com.list.groceries.listofproducts.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface ListOfProductsRepository extends JpaRepository<ListOfProducts, Long> {

}
