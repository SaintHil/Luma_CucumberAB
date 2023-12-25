package com.luma.stepDefinitions;

import com.luma.pages.LoginPage;
import com.luma.utilities.BrowserUtils;
import com.luma.utilities.ConfigurationReader;
import com.luma.utilities.Driver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinition {
    LoginPage loginPage = new LoginPage();

    @Given("The user on the home page")
    public void the_user_on_the_home_page() {

        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user enters login credentials")
    public void the_user_enters_login_credentials() {
      loginPage.login();
    }

    @Then("Verify that login is successful")
    public void verify_that_login_is_successful() {
        Assert.assertTrue(loginPage.welcomeMessage.isDisplayed());

    }
}
