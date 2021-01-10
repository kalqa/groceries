package com.list.groceries.offer;

import java.util.List;

import com.list.groceries.offer.domain.JobOffer;
import org.junit.jupiter.api.Test;

class JobOffersEditorFacadeTest {

    JobOffersEditorFacade jobOffersEditorFacade = new JobOffersEditorFacade();

    @Test
    public void usingFacade() {
        final List<JobOffer> allJobOffers = jobOffersEditorFacade.getEditedDeveloperOffers();
    }
}