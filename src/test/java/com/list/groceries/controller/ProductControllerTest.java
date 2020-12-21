package com.list.groceries.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@ContextConfiguration(classes = MockMvcConfig.class)
class ProductControllerTest {

    @Test
    public void shouldReturnCorrectMessageFromController(@Autowired MockMvc mockMvc) throws Exception {
        mockMvc.perform(get("/products"))
                .andExpect(status().isOk());
    }
}

@Configuration(proxyBeanMethods = false)
class MockMvcConfig {

    @Bean
    ProductController productController() {
        return new ProductController();
    }
}