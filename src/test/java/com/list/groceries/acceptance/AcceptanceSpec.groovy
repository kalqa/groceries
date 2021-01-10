package com.list.groceries.acceptance

import grails.plugin.spock.IntegrationSpec

class AcceptanceSpec extends IntegrationSpec{
    def "positive shopping scenario"(){
        given: 'no lists created and no products'

        when: 'I go to /lists'
        then: 'I see no lists'


        when: 'I go to /lists'
        then: 'I see no lists'
    }
}