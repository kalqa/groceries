package com.list.groceries.controller;

import com.list.groceries.model.product.ProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@ContextConfiguration(classes = MockMvcConfig.class)
class ProductControllerTest {

    @Test
    public void shouldReturnCorrectMessageFromControllerGet(@Autowired MockMvc mockMvc) throws Exception {
        mockMvc.perform(get("/products"))
                .andExpect(status().isOk());
    }

    @Test
    public void shouldReturnCorrectMessageFromControllerPost(@Autowired MockMvc mockMvc) throws Exception {
        mockMvc.perform(post("/products")
                .content(breadProduct())
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    private String breadProduct() {
        return "{ \"productName\" : \"Chleb\"}";
    }
}

@Configuration(proxyBeanMethods = false)
class MockMvcConfig {

    @Bean
    ProductRepository productRepository() {
        return BDDMockito.mock(ProductRepository.class);
    }

    @Bean
    ProductController productController(ProductRepository productRepository) {
        return new ProductController(productRepository);
    }
}