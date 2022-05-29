package com.qa.stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {


    @When("I enter  Invalid username as \"([^\"]*)\"$")
    public void iEnterInvalidUsernameAs(String Invalidusername) {
    }

    @When("I enter  Valid username as \"([^\"]*)\"$")
    public void iEnterValidUsernameAs(String validUsername) {
    }


    @And("I enter password as \"([^\"]*)\"$")
    public void iEnterPasswordAs(String password) {

    }

    @And("I enter InValidpassword as \"([^\"]*)\"$")
    public void iEnterInValidpasswordAs(String invalidPass) {
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
    }

    @Then("Login should fail with an error message \"([^\"]*)\"$")
    public void loginShouldFailWithAnErrorMessage(String errText) {
    }

    @Then("Login should sueccesfull and show Tittle \"([^\"]*)\"$")
    public void loginShouldSueccesfullAndShowTittle(String arg0) {
    }

}
