package com.luma.pages;

import com.luma.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(id="email")
    public WebElement emailInputBox;
    @FindBy(css = "[name='login[password]']")
    public WebElement passwordInputBox;
    @FindBy(css = ".action.login.primary")
    public WebElement singInBtn;
    @FindBy(xpath = "//span[contains(.,'Welcome')]")
    public WebElement welcomeMessage;

    public void login(){
        signInLink.click();
        emailInputBox.sendKeys(ConfigurationReader.get("useremail"));
        passwordInputBox.sendKeys(ConfigurationReader.get("password"));
        singInBtn.click();
    }
    public void login(String email, String password){
        signInLink.click();
        emailInputBox.sendKeys(email);
        passwordInputBox.sendKeys(password);
        singInBtn.click();
    }

}
