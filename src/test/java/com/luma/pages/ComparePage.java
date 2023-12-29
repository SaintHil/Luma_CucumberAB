package com.luma.pages;

import com.luma.utilities.BrowserUtils;
import com.luma.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ComparePage extends BasePage{

    @FindBy(xpath = "//span[text()='Men']")
    public WebElement menCategory;
    @FindBy(xpath = "(//span[text()='Tops'])[2]")
    public WebElement topsUnderMen;
    @FindBy(xpath = "(//span[text()='Jackets'])[2]")
    public WebElement jacketsUnderMen;
    @FindBy(xpath = "(//span[text()='Add to Compare'])[1]")
    public WebElement addToCompareBtn;
    @FindBy(xpath = "(//div[contains(.,'You added product')])[6]  ")
    public WebElement verifyAddToCompareText;
    @FindBy(css = "[class='action delete']")
    public WebElement removeProductBtn;
    @FindBy(xpath = "//span[text()='OK']")
    public WebElement removeProductOK_Btn;
    @FindBy(xpath = "(//div[contains(.,'You removed product')])[6]")
    public WebElement verifyRemoveProduct;
    @FindBy(xpath = "//span[text()='Compare']")
    public WebElement goToCompareListBtn;
    @FindBy(xpath = "//td[@data-th='Product']/strong/a")
    public List<WebElement> productsInCompareList;
    @FindBy(xpath = "//span[text()='Clear All']")
    public WebElement clearAllBtn;
    @FindBy(xpath = "(//div[contains(.,'You cleared the comparison list.')])[6]")
    public WebElement verifyClearAllText;

    public void verifyCompareList(){
        for (WebElement element : productsInCompareList) {
            Assert.assertTrue(element.isDisplayed());
            System.out.println("Compare list = " + element.getText());
        }
    }
    public void addManyProductToCompareList(int count){
        for (int i = 1; i <= count; i++) {
            BrowserUtils.waitFor(1);
            BrowserUtils.clickWithJS(Driver.get().findElement(By.xpath("(//span[text()='Add to Compare'])["+i+"]")));
            BrowserUtils.waitFor(1);
            System.out.println("Eklenen " +i+ " . ürün = " + Driver.get().findElement(By.xpath("(//a[@class='product-item-link'])["+i+"]")).getText());
        }
    }
}
