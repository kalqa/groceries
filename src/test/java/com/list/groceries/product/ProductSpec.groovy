package com.list.groceries.product

import com.list.groceries.product.domain.Product
import com.list.groceries.product.domain.ProductConfiguration
import com.list.groceries.product.domain.ProductFacade
import spock.lang.Specification

class ProductSpec extends Specification {
    ProductFacade facade = new ProductConfiguration().productFacade()

    Product milk = createProductDto("mleko", 2.99)

    def "should add product"(){
        when: "we add a product"
            facade.add(milk)
        then: "product repository has this product"
            facade.show(milk.name) == milk
    }

    Product createProductDto(String name, Double price) {
        Product.builder()
                .name(name)
                .price(price)
                .build()
    }
}
