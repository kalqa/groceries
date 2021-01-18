package com.list.groceries.list.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
interface ShoppingListRepository extends JpaRepository<ShoppingList, Long> {
}
