package com.luma.stepDefinitions;

import com.luma.pages.ComparePage;
import com.luma.pages.LoginPage;
import com.luma.utilities.BrowserUtils;
import com.luma.utilities.ConfigurationReader;
import com.luma.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CompareStepDefinition {
    LoginPage loginPage=new LoginPage();
    ComparePage comparePage=new ComparePage();

    @When("The user navigates to Jackets page of Men Category")
    public void the_user_navigates_to_jackets_page_of_men_category() {
        BrowserUtils.hover(comparePage.menCategory);
        BrowserUtils.hover(comparePage.topsUnderMen);
        comparePage.jacketsUnderMen.click();
    }
    @When("The user clicks to Add to Compare button of any product")
    public void the_user_clicks_to_add_to_compare_button_of_any_product() {
        BrowserUtils.clickWithJS(comparePage.addToCompareBtn);
    }
    @Then("Verify that the addition is successful by the text under Category Title")
    public void verify_that_the_addition_is_successful_by_the_text_under_category_title() {
        BrowserUtils.verifyElementDisplayed(comparePage.verifyAddToCompareText);
    }
    @When("The user navigates to Compare List page")
    public void the_user_navigates_to_compare_list_page() {
        BrowserUtils.waitFor(1);
        BrowserUtils.clickWithJS(comparePage.goToCompareListBtn);
    }
    @When("The user clicks to remove product button")
    public void the_user_clicks_to_remove_product_button() {
        BrowserUtils.clickWithJS(comparePage.removeProductBtn);
        BrowserUtils.waitFor(1);
        comparePage.removeProductOK_Btn.click();
    }
    @Then("Verify that the product is removed from Compare List")
    public void verify_that_the_product_is_removed_from_compare_list() {
        Assert.assertTrue(comparePage.verifyRemoveProduct.isDisplayed());
    }
    @When("The user clicks to Add to Compare button for more than one products")
    public void the_user_clicks_to_add_to_compare_button_for_more_than_one_products() {
        comparePage.addManyProductToCompareList(11);
    }
    @Then("Verify that more than one products are visible side by side and comparable")
    public void verify_that_more_than_one_products_are_visible_side_by_side_and_comparable() {
        int m = 1;
        for (int i = 11; i >= 1; i--) {
            for (int j = m; j <= m; j++) {
                Assert.assertTrue(Driver.get().findElement(By.xpath
                        ("(//td[@data-th='Product']/strong/a)[" + i + "]")).isDisplayed());
                System.out.println("Compare Listteki " + j + " . ürün = " + Driver.get().findElement(By.xpath
                        ("(//td[@data-th='Product']/strong/a)[" + i + "]")).getAttribute("title"));
            }
            m = m + 1;
        }
        //comparePage.verifyCompareList();
    }
    @When("The user clicks to clear all button")
    public void the_user_clicks_to_clear_all_button() {
        BrowserUtils.waitFor(1);
        BrowserUtils.clickWithJS(comparePage.clearAllBtn);
        BrowserUtils.waitFor(1);
        comparePage.removeProductOK_Btn.click();
    }
    @Then("Verify that compare list is cleaned")
    public void verify_that_compare_list_is_cleaned() {
        BrowserUtils.verifyElementDisplayed(comparePage.verifyClearAllText);
        System.out.println(comparePage.verifyClearAllText.getText());
    }
}
