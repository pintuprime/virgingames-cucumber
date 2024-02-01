package com.virgingames.steps;

import com.virgingames.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class HomePageSteps {
    @Given("I am on home page")
    public void iAmOnHomePage() {

    }

    @And("I verify I am on home page")
    public void iVerifyIAmOnHomePage() {
        String expectedTitle = "Virgin Games | Play Online Betting Games With Real Money";
        Assert.assertEquals(new HomePage().getTitle(), expectedTitle);
    }

    @When("I accept Necessary cookies only")
    public void iAcceptNecessaryCookiesOnly() {
        new HomePage().clickOnNecessarycookies();
    }

    @Then("I click on Join Now tab")
    public void iClickOnJoinNowTab() {
        new HomePage().clickOnJoinNowTab();
    }

    @And("I click online slots")
    public void iClickOnlineSlots() {
        new HomePage().clickOnOnlineSlots();
    }
}
