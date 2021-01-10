package com.list.groceries.offer.domain;

import com.list.groceries.offer.infrastructure.HttpClientExample;

public class JobService {

    JobOfferMapper jobOfferMapper;

    public JobOffer getJobFromService(){
        HttpClientExample httpClient = new HttpClientExample();
        //http call
        JobOfferResponse response = httpClient.getOffer("https://joboffers.com");
        return jobOfferMapper.map(response);
    }
}
