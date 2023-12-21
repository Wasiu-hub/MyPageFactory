package com.next.steps;

import com.next.page.SearchPage;
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

public class Search extends CommonFunctions {

    SearchPage searchPage = new SearchPage(driver);

    @Given("I am on the next home page")
    public void i_am_on_the_next_home_page() {
        searchPage.acceptCookies();
    }

    @When("I enter {string} as a product")
    public void i_enter_as_a_product(String productType) {
        searchPage.sendProductTypeInSearchBox(productType);
    }

    @When("I click on search button")
    public void i_click_on_search_button() {
        searchPage.clickOnSearch();
    }

    @Then("I should be able to see {string} as a result title")
    public void i_should_be_able_to_see_as_a_result_title(String resultTitle) {

        String expectedValue = "\"" + resultTitle + "\"";
        String actualValue = searchPage.getResultTitle();
        Assert.assertEquals(expectedValue, actualValue);

    }
}
