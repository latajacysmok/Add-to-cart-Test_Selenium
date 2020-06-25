package com.addToCart.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddToCartPage extends PageObject {

    @FindBy(tagName = "h2")
    private WebElement headerPage;

    @FindBy(css = "#layer_cart_product_title")
    private WebElement dressName;

    @FindBy(xpath = "//span[contains(.,'Proceed to checkout')]")
    private WebElement proceedToCheckoutButton;

    public AddToCartPage(WebDriver webDriver, String dress) {
        super(webDriver);
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(headerPage,"Product successfully added to your shopping cart"));
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(dressName, dress));
    }

    public ShoppingCartSummaryPage clickProceedToCheckoutButton(String selectedDress){
        proceedToCheckoutButton.click();
        return new ShoppingCartSummaryPage(webDriver, selectedDress);
    }
}
