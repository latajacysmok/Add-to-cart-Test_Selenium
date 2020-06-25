package com.addToCart.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class TypeOfDressesPage extends PageObject{
    @FindBy(tagName = "h1")
    private WebElement headerPage;

    @FindBy(className = "cat-name")
    private WebElement mainCategoryName;

    @FindBy(id = "selectProductSort")
    private WebElement sortChoice;

    @FindBy(css = "[alt='Printed Dress']")
    private WebElement dressChoiceButton;

    public TypeOfDressesPage(WebDriver webDriver, String typeOfDress) {
        super(webDriver);
        webDriverWait.until(ExpectedConditions.visibilityOf(headerPage));
        webDriverWait.until(ExpectedConditions.textToBePresentInElement(mainCategoryName, typeOfDress));
    }

    public void selectSort(String state) {
        new Select(sortChoice).selectByVisibleText(state);
    }

    public ChoiceDressesPage clickChosenDressesButton(String dress){
        dressChoiceButton.click();
        return new ChoiceDressesPage(webDriver, dress);
    }

}
