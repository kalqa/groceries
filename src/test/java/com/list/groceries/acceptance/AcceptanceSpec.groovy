package com.list.groceries.acceptance

import grails.plugin.spock.IntegrationSpec

class AcceptanceSpec extends IntegrationSpec{
    def "positive shopping scenario"(){
        given: 'no lists created and no products'

        when: 'I go to /lists'
        then: 'I see no lists'

        when: 'I go to /products'
        then: 'I see no products'

        when: 'I post to /products with two products'
        then: 'I have added two products'

        when: 'I go to /products'
        then: 'I see two products'

        when: 'I post to /lists with list'
        then: 'I have added new list'

        when: 'I post to /lists/1 with two products'
        then: 'I have added two products to list 1 and if not in products add new products to products'

        when: 'I go to /lists/1'
        then: 'I see list with 2 not marked products'

        when: 'I post to /lists/1/product/1'
        then: 'I marked first product from list as done'

        when: 'I post to /lists/1/product/2'
        then: 'I marked 2nd product from list as done'

        when: 'I go to /lists/1'
        then: 'I see list with 2 marked products'
    }
}