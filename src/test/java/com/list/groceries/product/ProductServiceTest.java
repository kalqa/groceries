package com.list.groceries.product;

import java.util.List;

import com.list.groceries.repository.ProductRepository;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class ProductServiceTest extends ProductTestBase {

    ProductRepository productRepository = mock(ProductRepository.class);
    ProductService productService = new ProductService(productRepository);

    @Test
    public void listAllProducts() {
        final List<Product> expectedProducts = aProducts(
                aProduct("Chleb"),
                aProduct("Mieso"));
        when(productRepository.findAll()).thenReturn(expectedProducts);

        final List<Product> allProducts = productService.getAllProducts();

        assertThat(allProducts).isEqualTo(expectedProducts);
    }

    @Test
    public void createProductInRepository() {
        final Product expectedProduct = aProduct("Chleb");
        when(productRepository.save(expectedProduct)).thenReturn(expectedProduct);

        final Product product = productService.addNewProduct(expectedProduct);

        assertThat(product).isEqualTo(expectedProduct);
    }
}