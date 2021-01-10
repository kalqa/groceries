package com.list.groceries.offer.domain;

import java.util.ArrayList;
import java.util.List;

import com.list.groceries.offer.infrastructure.HttpClientExample;

public class JobService {

    JobOfferMapper jobOfferMapper;
    JobOfferFactory jobOfferFactory = new JobOfferFactory();

    public JobOffer getJobFromService(){
        HttpClientExample httpClient = new HttpClientExample();
        //http call
        JobOfferResponse response = httpClient.get("https://joboffers.com");
        return jobOfferMapper.map(response);
    }

    public List<JobOffer> getTwoOffers(){
        final JobOffer javaJobOffer = jobOfferFactory.createJavaJobOffer();
        final JobOffer pythonJobOffer = jobOfferFactory.createPythonJobOffer();
        List<JobOffer> jobOffers = new ArrayList<>();
        jobOffers.add(javaJobOffer);
        jobOffers.add(pythonJobOffer);
        return jobOffers;
    }
}
