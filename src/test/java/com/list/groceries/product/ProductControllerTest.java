package com.list.groceries.product;

import com.list.groceries.product.domain.ProductFacade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@ContextConfiguration(classes = MockMvcConfig.class)
class ProductControllerTest {

    @Test
    public void should_return_status_ok_when_post_bread_for_products_controller(@Autowired MockMvc mockMvc) throws Exception {
        mockMvc.perform(post("/products")
                .content(breadProduct())
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void should_return_status_bad_request_when_post_wrong_bread_for_products_controller(@Autowired MockMvc mockMvc) throws Exception {
        mockMvc.perform(post("/products")
                .content(wrongBreadProduct())
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());
    }

    private String wrongBreadProduct() {
        return "{ \"name\" : \"Chleb\"}";
    }

    private String breadProduct() {
        return "{ \"name\" : \"Chleb\", \"price\" : 2.55}";
    }
}

@Configuration(proxyBeanMethods = false)
class MockMvcConfig {

    @Bean
    ProductFacade productFacade() {
        return mock(ProductFacade.class);
    }

    @Bean
    ProductController productController(ProductFacade productFacade) {
        return new ProductController(productFacade);
    }
}