package com.list.groceries.offer.domain;

public class JobOfferResponse {

    String position;
    Integer salary;
    String contractType;

    public JobOfferResponse(String position, Integer salary, String contractType) {
        this.position = position;
        this.salary = salary;
        this.contractType = contractType;
    }
}
