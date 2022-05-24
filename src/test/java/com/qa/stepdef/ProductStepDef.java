package com.qa.stepdef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ProductStepDef {
    @Given("^User is logged in to the application \"([^\"]*)\"$")
    public void userIsLoggedInToTheApplication() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^click on the product tittle \"([^\"]*)\"$")
    public void clickOnTheProductTittleTittle(String title) {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("The product details page should be displayed with \"([^\"]*)\" ,\"([^\"]*)\" and \"([^\"]*)\"$")
    public void theProductDetailsPageShouldBeDisplayedWithTittlePriceAndDescription() {
        // Write code here that turns the phrase above into concrete actions

    }
}
