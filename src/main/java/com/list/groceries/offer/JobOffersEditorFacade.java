package com.list.groceries.offer;

import java.util.List;

import com.list.groceries.offer.domain.JobOffer;
import com.list.groceries.offer.domain.JobOfferMapper;
import com.list.groceries.offer.domain.JobOfferResponse;
import com.list.groceries.offer.domain.JobOffersEditor;
import com.list.groceries.offer.infrastructure.HttpClientExample;

public class JobOffersEditorFacade {

    HttpClientExample httpClientExample = new HttpClientExample();
    JobOffersEditor jobOffersEditor = new JobOffersEditor();
    JobOfferMapper jobOfferMapper = new JobOfferMapper();

    public List<JobOffer> getEditedDeveloperOffers() {
        final List<JobOfferResponse> jobOfferResponse = httpClientExample.getOffers("https://joboffers.com");
        final List<JobOffer> developerOffers = jobOfferMapper.mapListOfOffers(jobOfferResponse);
        return jobOffersEditor.editDeveloperOffers(developerOffers);
    }
}
