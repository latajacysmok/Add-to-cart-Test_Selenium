package com.addToCart.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DressesPage extends PageObject{
    @FindBy(tagName = "h1")
    private WebElement headerPage;

    @FindBy(className = "cat-name")
    private WebElement mainCategoryName;

    @FindBy(xpath = "//ul[@class='clearfix']//a[.='Evening Dresses']")
    private WebElement typeOfDressesButton;;

    public DressesPage(WebDriver webDriver, String category) {
        super(webDriver);
        webDriverWait.until(ExpectedConditions.visibilityOf(headerPage));
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(mainCategoryName, category));
//        System.out.println("##################################################" + mainCategoryName.getText());
    }

    public TypeOfDressesPage clickTypeOfDressesButton(String typeOfDress){
        typeOfDressesButton.click();
        return new TypeOfDressesPage(webDriver, typeOfDress);
    }
}
