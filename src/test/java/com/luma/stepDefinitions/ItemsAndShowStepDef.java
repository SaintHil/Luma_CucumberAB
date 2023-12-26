package com.luma.stepDefinitions;

import com.luma.utilities.BrowserUtils;
import com.luma.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ItemsAndShowStepDef {



    @When("the user hovers over the {string} section and hovers over on the {string} subsection")
    public void theUserHoversOverTheSectionAndHoversOverOnTheSubsection(String section, String subsection) {
        BrowserUtils.waitFor(1);
        BrowserUtils.hover(Driver.get().findElement(By.xpath("//span[text()='"+section+"']")));

        BrowserUtils.hover(Driver.get().findElement(By.xpath("(//span[text()='"+subsection+"'])["+getGender(section)+"]")));


    }

    @When("the user hovers over the {string} section")
    public void theUserHoversOverTheSection(String section) {
        BrowserUtils.waitFor(1);
        BrowserUtils.hover(Driver.get().findElement(By.xpath("//span[text()='"+section+"']")));
    }


    @And("clicks on the {string}, {string} nested subsection")
    public void clicksOnTheNestedSubsection(String section, String nestedSubsection) {
        Driver.get().findElement(By.xpath("(//span[contains(.,'"+nestedSubsection+"')])["+getGender(section)+"]")).click();
    }

    int getGender(String section){
        //1 women, 2 men
        return section.equals("Men") ? 2 : 1;
    }

    @Then("the user should be redirected to the {string} nested subsection page")
    public void theUserShouldBeRedirectedToTheNestedSubsectionPage(String title) {
        Assert.assertTrue(Driver.get().findElement(By.className("base")).getText().contains(title));
    }


    @And("the user clicks to the {string} section")
    public void theUserClicksToTheSection(String section) {
        Driver.get().findElement(By.xpath("//span[contains(.,'"+section+"')]")).click();
    }
}
