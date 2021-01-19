package com.list.groceries.listofproducts;

import com.list.groceries.listofproducts.domain.ListOfProductsFacade;
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
class ListOfProductsControllerTest {

    @Test
    public void should_return_ok_when_correct_list_of_products_posted(@Autowired MockMvc mockMvc) throws Exception {
        mockMvc.perform(post("/listofproducts")
                .content(listOfProducts())
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    @Test
    public void should_return_bad_request_when_wrong_list_of_products_posted(@Autowired MockMvc mockMvc) throws Exception {
        mockMvc.perform(post("/listofproducts")
                .content(wrongListOfProducts())
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isBadRequest());
    }

    private String listOfProducts() {
        return "{\"product\": 0,\"shoppingList\": 0}";
    }

    private String wrongListOfProducts() {
        return "{\"shoppingList\": 0}";
    }
}

@Configuration(proxyBeanMethods = false)
class MockMvcConfig {

    @Bean
    ListOfProductsFacade listOfProductsFacade() {
        return mock(ListOfProductsFacade.class);
    }

    @Bean
    ListOfProductsController listOfProductsController(ListOfProductsFacade listOfProductsFacade) {
        return new ListOfProductsController(listOfProductsFacade);
    }
}