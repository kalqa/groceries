package com.list.groceries.product;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.BDDAssertions.then;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

class ProductServiceTest extends ProductTestBase {

    ProductRepository productRepository = mock(ProductRepository.class);
    ProductService productService = new ProductService(productRepository);

    @Test
    public void should_list_all_products_correctly() {
        final List<Product> expectedProducts = aProducts(
                aChleb(),
                aMieso());
        when(productRepository.findAll()).thenReturn(expectedProducts);

        final List<Product> allProducts = productService.getAllProducts();

        assertThat(allProducts).isEqualTo(expectedProducts);
        BDDMockito.then(productRepository).should(times(1)).findAll();
    }

    @Test
    public void should_add_product_to_database() {
        final Product expectedProduct = aChleb();
        when(productRepository.save(expectedProduct)).thenReturn(expectedProduct);

        final Product product = productService.addNewProduct(expectedProduct);

        then(product.getId())
                .as("Must represent the same product")
                .isEqualTo(expectedProduct.getId());
        BDDMockito.then(productRepository).should(times(1)).save(any(Product.class));
    }
}