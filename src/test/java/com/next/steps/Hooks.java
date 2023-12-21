package com.next.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks extends CommonFunctions{

    @Before
    public void preActions() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.next.co.uk");

    }

    @After
    public void postActions() {
        driver.close();
    }
}
