package com.list.groceries.offer.domain;

public class JobOfferMapper {

    public JobOffer map(JobOfferResponse response) {
        return JobOffer.builder()
                .position(response.position)
                .salary(response.salary.toString())
                .build();
    }
}
