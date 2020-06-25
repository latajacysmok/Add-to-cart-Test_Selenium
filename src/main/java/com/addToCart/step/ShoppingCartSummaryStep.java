package com.addToCart.step;

import com.addToCart.page.ShoppingCartSummaryPage;
import io.cucumber.java8.En;

public class ShoppingCartSummaryStep implements En {

    ShoppingCartSummaryPage shoppingCartSummaryPage;

    public ShoppingCartSummaryStep(AddToCartStep addToCartStep) {
        Then("User checks the purchase in the cart", () -> {
            shoppingCartSummaryPage = addToCartStep.getAddToCartPage().clickProceedToCheckoutButton("Printed Dress");
        });
    }
}
