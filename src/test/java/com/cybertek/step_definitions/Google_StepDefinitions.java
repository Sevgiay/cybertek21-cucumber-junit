package com.cybertek.step_definitions;

import com.cybertek.pages.GoogleSearchPages;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Google_StepDefinitions {


    @Then("User should see title is Google")
    public void user_should_see_title_is_google() {
      String actual = Driver.getDriver().getTitle();
      String expected = "Google";

      Assert.assertTrue(actual.equals(expected));
    }


    @Given("User is on Google home page")
    public void user_is_on_google_home_page() {

        Driver.getDriver().get("https://www.google.com");

    }
    @When("User searches for apple")
    public void user_searches_for_apple() {
        GoogleSearchPages googleSearchPages = new GoogleSearchPages();
        googleSearchPages.searchBar.sendKeys("apple"+ Keys.ENTER);
        }

    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {
       String actualTitle = Driver.getDriver().getTitle();
       String expectedInTitle ="apple";

        Assert.assertTrue(actualTitle.contains(expectedInTitle));
        }

    }
