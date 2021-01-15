package com.list.groceries.list.domain;

import org.springframework.data.jpa.repository.JpaRepository;

interface ShoppingListRepository extends JpaRepository<ShoppingList, Long> {
}
