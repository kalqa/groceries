package com.list.groceries.offer.domain;


public class HttpClientExample {

    public JobOfferResponse get(String url) {
        return new JobOfferResponse("developer", 4000, "B2B");
    }
}