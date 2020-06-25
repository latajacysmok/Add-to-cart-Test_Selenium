package com.addToCart.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ChoiceDressesPage extends PageObject {

    @FindBy(tagName = "h1")
    private WebElement headerPage;

    @FindBy(xpath = "//span[.='Add to cart']")
    private WebElement addToCartButton;

    public ChoiceDressesPage(WebDriver webDriver, String dress) {
        super(webDriver);
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(headerPage, dress));
    }

    public AddToCartPage clickAddToCartButton(String dress){
        addToCartButton.click();
        return new AddToCartPage(webDriver, dress);
    }

}
