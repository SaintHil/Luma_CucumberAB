package com.luma.stepDefinitions;

import com.luma.utilities.BrowserUtils;
import com.luma.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class CategoryStepDefinitions {


    @When("The user hovers over on the {string} and {string} and clicks {string}")
    public void the_user_hovers_over_on_the_and_and_clicks(String Category, String SubCatButton, String NestedSubCatButton) {
        BrowserUtils.waitFor(1);
        BrowserUtils.hover(Driver.get().findElement(By.xpath("//span[text()='"+Category+"']")));
        BrowserUtils.waitFor(2);
        BrowserUtils.hover(Driver.get().findElement(By.xpath("(//span[text()='"+SubCatButton+"'])["+getGender(Category)+"]")));
        BrowserUtils.waitFor(2);
        Driver.get().findElement(By.xpath("(//span[contains(.,'"+NestedSubCatButton+"')])["+getGender(Category)+"]")).click();
        BrowserUtils.waitFor(2);
    }
    int getGender(String section) {
        //1 women, 2 men
        return section.equals("Men") ? 2 : 1;

    }
    @Then("Verify that the user is directed to NestedSubSection page")
    public void verify_that_the_user_is_directed_to_nested_sub_section_page() {



    }

    @When("the user hovers over over on the {string} and clicks to the {string}")
    public void the_user_hovers_over_over_the_and_clicks_to_the(String GearButton, String SubGearButton) {

    }

    @Then("Verify that the user is on the SubGear page")
    public void verify_that_the_user_is_on_the_sub_gear_page() {

        }
    @When("the user hovers over on the {string} and clicks on the {string}")
    public void the_user_hovers_over_on_the_and_clicks_on_the(String TrainingButton, String SubTrainingButton) {

    }
    @Then("Verify that the user is on the SubTraining page")
    public void verify_that_the_user_is_on_the_sub_training_page() {

    }
    @When("the user clicks on the {string}")
    public void the_user_clicks_on_the(String SaleButton) {

    }
    @Then("Verify that the user is on the {string} Page")
    public void verify_that_the_user_is_on_the_page(String Sale) {

    }

}
