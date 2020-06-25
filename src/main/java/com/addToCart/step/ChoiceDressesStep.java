package com.addToCart.step;

import com.addToCart.page.ChoiceDressesPage;
import io.cucumber.java8.En;

public class ChoiceDressesStep implements En {

    ChoiceDressesPage choiceDressesPage;

    public ChoiceDressesStep(TypeOfDressesStep typeOfDressesStep) {
        And("User select a new {string}", (String dress) -> {
            choiceDressesPage = typeOfDressesStep.getTypeOfDressesPage().clickChosenDressesButton(dress);
        });
    }

    public ChoiceDressesPage getChoiceDressesPage() {
        return choiceDressesPage;
    }

}
