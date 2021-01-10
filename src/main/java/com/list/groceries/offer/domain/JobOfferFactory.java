package com.list.groceries.offer.domain;

public class JobOfferFactory {

    public JobOffer createJavaJobOffer() {
        return JobOffer.builder()
                .position("Java")
                .salary("5000 PLN")
                .build();
    }

    public JobOffer createPythonJobOffer() {
        return JobOffer.builder()
                .position("Python")
                .salary("2500 PLN")
                .build();
    }
}
