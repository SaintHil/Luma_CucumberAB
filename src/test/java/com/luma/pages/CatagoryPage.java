package com.luma.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CatagoryPage extends BasePage{

    @FindBy(xpath = "//span[text()='Men']")
    public WebElement menCategory;

}
