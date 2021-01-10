package com.list.groceries.offer.domain;

import java.util.List;
import java.util.stream.Collectors;

public class JobOffersEditor {

    public List<JobOffer> editDeveloperOffers(List<JobOffer> offers) {
        return offers.stream()
                .filter(jobOffer -> jobOffer.getPosition().equals("developer"))
                .map(jobOffer -> JobOffer.builder()
                        .position("not developer")
                        .salary(jobOffer.getSalary())
                        .build())
                .collect(Collectors.toList());
    }
}
