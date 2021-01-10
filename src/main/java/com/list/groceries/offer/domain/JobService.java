package com.list.groceries.offer.domain;


public class JobService {

    JobOfferMapper jobOfferMapper;

    public JobOffer getJobFromService(){
        HttpClientExample httpClient = new HttpClientExample();
        //http call
        JobOfferResponse response = httpClient.get("https://joboffers.com");
        return jobOfferMapper.map(response);
    }
}
