package com.next.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.cucumber.messages.types.Duration.*;

public class Search extends Hooks{

    @Given("I am on the next home page")
    public void i_am_on_the_next_home_page() {

        driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();// customized
    }

    @When("I enter {string} as a product")
    public void i_enter_as_a_product(String productType) {
        driver.findElement(By.xpath("//input[@id='header-big-screen-search-box']")).sendKeys(productType);
    }

    @When("I click on search button")
    public void i_click_on_search_button() {
//        driver.findElement(By.xpath("//img[@alt='Search Icon']")).click();
//        driver.findElement(By.xpath("//img[@src='/static-content/icons/header/next/v1/vision/search-input-button.svg']")).click();

        driver.findElement(By.xpath("//button[@data-testid='header-search-bar-button']/img")).click();
    }

    @Then("I should be able to see {string} as a result tiltle")
    public void i_should_be_able_to_see_as_a_result_title(String resultTitle) {

        String expectedValue = "\"" + resultTitle + "\"";
//        Thread.sleep(2000);
        String actualValue = driver.findElement(By.xpath("//span[@data-testid= 'plp-product-title-text']")).getText();

        Assert.assertEquals(expectedValue, actualValue);

    }
    @Then("I should be able to see {string} as a result title")
    public void iShouldBeAbleToSeeAsAResultTitle(String string) {
    }
}
