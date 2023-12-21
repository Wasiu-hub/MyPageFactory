package com.next.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    public void acceptCookies(WebDriver driver){
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
    }

    public void sendProductTypeInSearchBox(WebDriver driver, String productType){
        driver.findElement(By.xpath("//input[@id='header-big-screen-search-box']")).sendKeys(productType);

    }

    public void clickOnSearch(WebDriver driver) {
        driver.findElement(By.xpath("//button[@data-testid='header-search-bar-button']/img")).click();

    }

    public String getResultTitle(WebDriver driver) {
       return driver.findElement(By.xpath("//span[@data-testid= 'plp-product-title-text']")).getText();
    }
}
