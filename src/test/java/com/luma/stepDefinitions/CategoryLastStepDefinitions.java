package com.luma.stepDefinitions;
import com.luma.pages.CategoryLastPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CategoryLastStepDefinitions {
    CategoryLastPage categoryPage = new CategoryLastPage();

    @When("The user navigates to {string} and subcategory")
    public void the_user_navigates_to_and_subcategory(String category) {
        categoryPage.navigateToCategory(category);
    }
    @Then("Verify that the user is on the selected {string} page")
    public void verify_that_the_user_is_on_the_selected_page(String category) {
        categoryPage.navigateToSubCategoryAndVerify(category);
    }
}

