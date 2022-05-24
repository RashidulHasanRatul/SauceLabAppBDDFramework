package com.qa.stepdef;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
    @When("^I enter  username as \"([^\"]*)\"$")
    public void iEnterUsernameAs(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("^I enter  password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String string) {
        // Write code here that turns the phrase above into concrete actions

    }
    @When("^I click the login button \"([^\"]*)\"$")
    public void iClickTheLoginButton() {
        // Write code here that turns the phrase above into concrete actions

    }
    @Then("^Login should fail with an error message \"([^\"]*)\"$")
    public void loginShouldFailWithAnErrorMessage(String string) {
        // Write code here that turns the phrase above into concrete actions

    }

}
