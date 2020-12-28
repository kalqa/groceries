package com.list.groceries.acceptance

import grails.plugin.spock.IntegrationSpec

class CreatingListWithProductsAcceptanceSpec extends IntegrationSpec{
    def "positive creating product list scenario"(){
        given: 'no lists created and no products'

        when: 'when i go to /lists then I see all my lists'
        then: 'I see no lists'
    }
}