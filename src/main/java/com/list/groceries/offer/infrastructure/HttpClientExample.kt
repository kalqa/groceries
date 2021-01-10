package com.list.groceries.offer.infrastructure

import com.list.groceries.offer.domain.JobOfferResponse

class HttpClientExample {

    fun getOffer(url: String?): JobOfferResponse {
        return JobOfferResponse("developer", 4000, "B2B")
    }

    fun getOffers(url: String?): List<JobOfferResponse> {
        return listOf<JobOfferResponse>(
            JobOfferResponse("developer", 4000, "B2B"),
            JobOfferResponse("bankier", 3200, "B2B"),
        )
    }
}