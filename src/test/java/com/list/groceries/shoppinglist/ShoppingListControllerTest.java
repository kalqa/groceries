package com.list.groceries.shoppinglist;

import com.list.groceries.list.ShoppingListController;
import com.list.groceries.list.domain.ShoppingListFacade;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.mock;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest
@ContextConfiguration(classes = MockMvcConfig.class)
class ShoppingListControllerTest {

    @Test
    public void should_return_status_ok_when_get_for_shoppinglist_controller(@Autowired MockMvc mockMvc) throws Exception {
        mockMvc.perform(get("/shoppingList"))
                .andExpect(status().isOk());
    }

    @Test
    public void should_return_status_ok_when_post_mondaylist_for_shoppinglist_controller(@Autowired MockMvc mockMvc) throws Exception {
        mockMvc.perform(post("/shoppingList")
                .content(mondayShoppingList())
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());
    }

    private String mondayShoppingList() {
        return "{ \"name\" : \"Lista na poniedziałek\"}";
    }
}

@Configuration(proxyBeanMethods = false)
class MockMvcConfig {

    @Bean
    ShoppingListFacade shoppingListFacade() {
        return mock(ShoppingListFacade.class);
    }

    @Bean
    ShoppingListController shoppingListController(ShoppingListFacade shoppingListFacade) {
        return new ShoppingListController(shoppingListFacade);
    }
}