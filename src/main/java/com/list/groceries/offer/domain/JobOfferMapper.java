package com.list.groceries.offer.domain;

import java.util.List;
import java.util.stream.Collectors;

public class JobOfferMapper {

    public JobOffer map(JobOfferResponse response) {
        return JobOffer.builder()
                .position(response.position)
                .salary(response.salary.toString() + "PLN")
                .build();
    }

    public List<JobOffer> mapListOfOffers(List<JobOfferResponse> jobOfferResponse) {
        return jobOfferResponse.stream()
                .map(this::map)
                .collect(Collectors.toList());
    }
}
