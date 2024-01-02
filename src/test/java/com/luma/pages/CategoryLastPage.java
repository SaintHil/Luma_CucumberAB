package com.luma.pages;

import com.luma.utilities.BrowserUtils;
import com.luma.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CategoryLastPage extends BasePage {
    @FindBy(xpath = "//ul[@id='ui-id-2']/li")
    public List<WebElement> categoryList;
    @FindBy(xpath = "//li[starts-with(@class,'level1 nav-2-')]")
    public List<WebElement> subCatListW;
    @FindBy(xpath = "//li[starts-with(@class,'level1 nav-3-')]")
    public List<WebElement> subCatListM;
    @FindBy(xpath = "//li[starts-with(@class,'level1 nav-4-')]")
    public List<WebElement> subCatListG;
    @FindBy(xpath = "//li[starts-with(@class,'level1 nav-5-')]")
    public List<WebElement> subCatListT;
    @FindBy(xpath = "//li[starts-with(@class,'level2 nav-2-1')]")
    public List<WebElement> nestedSubCatListWT;
    @FindBy(xpath = "//li[starts-with(@class,'level2 nav-2-2')]")
    public List<WebElement> nestedSubCatListWB;
    @FindBy(xpath = "//li[starts-with(@class,'level2 nav-3-1')]")
    public List<WebElement> nestedSubCatListMT;
    @FindBy(xpath = "//li[starts-with(@class,'level2 nav-3-2')]")
    public List<WebElement> nestedSubCatListMB;
    @FindBy(css = "[class='base']")
    public WebElement currentTitle;
    public void navigateToCategory(String category) {
        switch (category) {
            case "What's New":
                break;
            case "Women", "Men", "Gear", "Training", "Sale":
                BrowserUtils.waitFor(1);
                BrowserUtils.hover(Driver.get().findElement(By.xpath("//span[text()='" + category + "']")));
                break;
        }
    }
    public void navigateToSubCategoryAndVerify(String category) {
        switch (category) {
            case "What's New":
                categoryList.get(0).click();
                BrowserUtils.waitFor(1);
                Assert.assertEquals(categoryList.get(0).getText(), currentTitle.getText());
                break;
            case "Women":
                for (int i = 0; i < subCatListW.size(); i++) {
                    BrowserUtils.hover(subCatListW.get(i));
                    switch (i) {
                        case 0:
                            for (int j = 0; j < nestedSubCatListWT.size(); j++) {
                                String expectedText = nestedSubCatListWT.get(j).getText();
                                nestedSubCatListWT.get(j).click();
                                BrowserUtils.waitFor(1);
                                Assert.assertEquals(currentTitle.getText(), expectedText);
                                BrowserUtils.hover(Driver.get().findElement(By.xpath("//span[text()='" + category + "']")));
                                BrowserUtils.hover(subCatListW.get(i));
                            }
                            break;
                        case 1:
                            for (int j = 0; j < nestedSubCatListWB.size(); j++) {
                                String expectedText = nestedSubCatListWB.get(j).getText();
                                nestedSubCatListWB.get(j).click();
                                BrowserUtils.waitFor(1);
                                Assert.assertEquals(currentTitle.getText(), expectedText);
                                BrowserUtils.hover(Driver.get().findElement(By.xpath("//span[text()='" + category + "']")));
                                BrowserUtils.hover(subCatListW.get(i));
                            }
                            break;
                    }
                }
                break;
            case "Men":
                for (int i = 0; i < subCatListM.size(); i++) {
                    BrowserUtils.hover(subCatListM.get(i));
                    switch (i) {
                        case 0:
                            for (int j = 0; j < nestedSubCatListMT.size(); j++) {
                                String expectedText = nestedSubCatListMT.get(j).getText();
                                nestedSubCatListMT.get(j).click();
                                BrowserUtils.waitFor(1);
                                Assert.assertEquals(currentTitle.getText(), expectedText);
                                BrowserUtils.hover(Driver.get().findElement(By.xpath("//span[text()='" + category + "']")));
                                BrowserUtils.hover(subCatListM.get(i));
                            }
                            break;
                        case 1:
                            for (int j = 0; j < nestedSubCatListMB.size(); j++) {
                                String expectedText = nestedSubCatListMB.get(j).getText();
                                nestedSubCatListMB.get(j).click();
                                BrowserUtils.waitFor(1);
                                Assert.assertEquals(currentTitle.getText(), expectedText);
                                BrowserUtils.hover(Driver.get().findElement(By.xpath("//span[text()='" + category + "']")));
                                BrowserUtils.hover(subCatListM.get(i));
                            }
                            break;
                    }
                }
                break;
            case "Gear":
                for (int i = 0; i < subCatListG.size(); i++) {
                    String expectedText = subCatListG.get(i).getText();
                    subCatListG.get(i).click();
                    BrowserUtils.waitFor(1);
                    Assert.assertEquals(currentTitle.getText(), expectedText);
                    BrowserUtils.hover(Driver.get().findElement(By.xpath("//span[text()='" + category + "']")));
                }
                break;
            case "Training":
                for (int i = 0; i < subCatListT.size(); i++) {
                    String expectedText = subCatListT.get(i).getText();
                    subCatListT.get(i).click();
                    BrowserUtils.waitFor(1);
                    Assert.assertEquals(currentTitle.getText(), expectedText);
                }
                break;
            case "Sale":
                categoryList.get(5).click();
                BrowserUtils.waitFor(1);
                Assert.assertEquals(categoryList.get(5).getText(), currentTitle.getText());
                break;
        }
    }

}

