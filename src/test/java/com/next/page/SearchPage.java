package com.next.page;

import com.sun.jna.WString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {

    public WebDriver driver;

    public SearchPage(WebDriver driver) {
        this.driver = driver;

    }

    @FindBy(xpath = "//button[@id='onetrust-accept-btn-handler']")
    private WebElement acceptBtn;

    public void acceptCookies() {
        acceptBtn.click();
    }

    @FindBy(xpath = "//input[@id='header-big-screen-search-box']")
    private WebElement searchInp;

    public void sendProductTypeInSearchBox(String productType) {
        searchInp.sendKeys(productType);

    }

    @FindBy(xpath = "//button[@data-testid='header-search-bar-button']/img")
    private WebElement searchBtn;

    public void clickOnSearch() {
        searchBtn.click();

    }

    @FindBy(xpath = "//span[@data-testid= 'plp-product-title-text']")
    private WebElement resultTitle;

    public String getResultTitle() {
        return resultTitle.getText();
    }
}
