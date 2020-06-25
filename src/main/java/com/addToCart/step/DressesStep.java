package com.addToCart.step;

import com.addToCart.page.DressesPage;
import io.cucumber.java8.En;

public class DressesStep implements En {

    DressesPage dressespage;

    public DressesStep(HomepageStep homepageStep) {
        When("User selects a {string}", (String category) -> {
            dressespage = homepageStep.getHomePage().clickDressesButton(category);
        });
    }

    public DressesPage getDressespage() {
        return dressespage;
    }

}
