package com.keysight.cucumber.steps;

import com.keysight.pages.HomePage;
import com.keysight.pages.TestAutomationSoftwarePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class MyStepdefs {
    @Given("^I am on Home page of Keysight site$")
    public void iAmOnHomePageOfKeysightSite() {
    }

    @When("^I click on Products and Services from top tab menu$")
    public void iClickOnProductsAndServicesFromTopTabMenu() {
        new HomePage().clickOnProductsAndServicesTab();
    }

    @And("^I mousehoover on software tab$")
    public void iMousehooverOnSoftwareTab() throws InterruptedException {
        Thread.sleep(1000);
        new HomePage().mouseHooverOnSoftwareTab();
    }

    @And("^I click on Test automation software$")
    public void iClickOnTestAutomationSoftware() {
        new HomePage().clickOnTestAutomationSoftwareTab();
    }

    @Then("^I verify 'Optimize Test Plans and Increase Test Efficiency' text$")
    public void iVerifyOptimizeTestPlansAndIncreaseTestEfficiencyText() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals("Message displayed","Optimize Test Plans and Increase Test Efficiency",
                new TestAutomationSoftwarePage().verifyOptimizeTestPlansAndIncreaseText());
    }


}
