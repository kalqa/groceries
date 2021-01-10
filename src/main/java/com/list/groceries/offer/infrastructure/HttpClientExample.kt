package com.list.groceries.offer.infrastructure;

import com.list.groceries.offer.domain.JobOfferResponse;

public class HttpClientExample {

    public JobOfferResponse get(String url) {
        return new JobOfferResponse("developer", 4000, "B2B");
    }
}
