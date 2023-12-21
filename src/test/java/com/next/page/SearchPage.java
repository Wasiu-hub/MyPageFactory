package com.next.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {
    public void acceptCookies(WebDriver driver){
        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
    }
}
