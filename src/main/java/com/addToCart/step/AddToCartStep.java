package com.addToCart.step;

import com.addToCart.page.AddToCartPage;
import io.cucumber.java8.En;

public class AddToCartStep implements En {

    AddToCartPage addToCartPage;

    public AddToCartStep(ChoiceDressesStep choiceDressesStep) {
        And("User add {string} to cart", (String dress) -> {
            addToCartPage = choiceDressesStep.getChoiceDressesPage().clickAddToCartButton(dress);
        });
    }

    public AddToCartPage getAddToCartPage() {
        return addToCartPage;
    }
}
