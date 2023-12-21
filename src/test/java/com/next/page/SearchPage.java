package com.next.page;

import com.sun.jna.WString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

    public WebDriver driver;

    public SearchPage(WebDriver driver){
        this.driver = driver;

    }
    public void acceptCookies(){
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
    }

    public void sendProductTypeInSearchBox(String productType){
        driver.findElement(By.xpath("//input[@id='header-big-screen-search-box']")).sendKeys(productType);

    }

    public void clickOnSearch() {
        driver.findElement(By.xpath("//button[@data-testid='header-search-bar-button']/img")).click();

    }
    public String getResultTitle() {
       return driver.findElement(By.xpath("//span[@data-testid= 'plp-product-title-text']")).getText();
    }
}
