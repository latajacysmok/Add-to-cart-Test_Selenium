package com.addToCart.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ShoppingCartSummaryPage extends PageObject {

    @FindBy(tagName = "h1")
    private WebElement headerPage;

    @FindBy(xpath = "//td[@class='cart_description']//a[.='Printed Dress']")
    private WebElement purchasedProduct;

    public ShoppingCartSummaryPage(WebDriver webDriver, String selectedDress) {
        super(webDriver);
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(headerPage,"SHOPPING-CART SUMMARY"));
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(purchasedProduct, selectedDress));
    }
}
