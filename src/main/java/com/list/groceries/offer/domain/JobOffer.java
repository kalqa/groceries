package com.list.groceries.offer.domain;

import lombok.Builder;

@Builder
public class JobOffer {

    String position;
    String salary;

    private JobOffer(String position, String salary) {
        this.position = position;
        this.salary = salary;
    }
}
