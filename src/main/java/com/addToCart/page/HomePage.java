package com.addToCart.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends PageObject{
    @FindBy(tagName = "h1")
    private WebElement headerPage;
    @FindBy(css = "ul.sf-menu > li > [title='Dresses']")
    private WebElement dressesButton;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(headerPage,"Automation Practice Website"));
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(dressesButton,"DRESSES"));
    }

    public DressesPage clickDressesButton(String category){
        dressesButton.click();
        return new DressesPage(webDriver, category);
    }

}
