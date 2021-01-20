package com.list.groceries.product.domain;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.containers.MySQLContainer;
import org.testcontainers.junit.jupiter.Testcontainers;

@SpringBootTest
@ActiveProfiles("container")
@Testcontainers
class ProductAddingWithContainerTest {

    MySQLContainer mySQLContainer = new MySQLContainer();
}
