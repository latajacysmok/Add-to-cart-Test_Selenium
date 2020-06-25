package com.addToCart.step;

import com.addToCart.page.DressesPage;
import com.addToCart.page.TypeOfDressesPage;
import io.cucumber.java8.En;

public class TypeOfDressesStep implements En {

    TypeOfDressesPage typeOfDressesPage;

    public TypeOfDressesStep(DressesStep dressesStep) {
        And("User select a {string}", (String typeOfDress) -> {
            typeOfDressesPage = dressesStep.getDressespage().clickTypeOfDressesButton(typeOfDress);
            typeOfDressesPage.selectSort("Reference: Highest first");
        });
    }

    public TypeOfDressesPage getTypeOfDressesPage() {
        return typeOfDressesPage;
    }

}
