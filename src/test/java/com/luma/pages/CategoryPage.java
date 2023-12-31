package com.luma.pages;

import com.luma.utilities.BrowserUtils;
import com.luma.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CategoryPage extends BasePage {

    @FindBy(xpath = "//span[text()='Men']")
    public WebElement menCategory;

    @FindBy(xpath = "//span[text()='Women']")
    public WebElement WomenCategory;
    @FindBy(xpath = "//span[text()='Gear']")
    public WebElement GearCategory;

    @FindBy(xpath = "//span[text()='Training']")
    public WebElement TrainingCategory;
    @FindBy(xpath = "//span[text()='Video Download']")
    public WebElement VideoDownloadBtn;
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

    public int getGender(String section) {
        return section.equals("Men") ? 2 : 1;
    }

    public void navigateToCategory(String category) {
        for (WebElement element : categoryList) {
            switch (category) {
                case "What's New":
                    break;
                case "Women":
                    BrowserUtils.hover(Driver.get().findElement(By.xpath("//span[text()='" + category + "']")));
                    break;
                case "Men":
                    BrowserUtils.hover(Driver.get().findElement(By.xpath("//span[text()='" + category + "']")));
                    break;
                case "Gear":
                    BrowserUtils.hover(Driver.get().findElement(By.xpath("//span[text()='" + category + "']")));
                    break;
                case "Training":
                    BrowserUtils.hover(Driver.get().findElement(By.xpath("//span[text()='" + category + "']")));
                    break;
                case "Sale":
                    break;

            }
        }
    }

    public void navigateToSubCategory(String category, String subCat, String nestedSubCat) {
        switch (category) {
            case "What's New":
                Driver.get().findElement(By.xpath("//span[text()='" + category + "']")).click();
                break;
            case "Women":
                for (WebElement element : subCatListW) {
                    switch (subCat) {
                        case "Tops":
                            for (WebElement webElement : nestedSubCatListWT) {
                                webElement.click();
                                BrowserUtils.hover(Driver.get().findElement(By.xpath("//span[text()='" + category + "']")));
                                BrowserUtils.hover(subCatListW.get(0));

                            }
                            break;
                        case "Buttoms":
                            for (WebElement webElement : nestedSubCatListWB) {
                                webElement.click();
                                BrowserUtils.hover(Driver.get().findElement(By.xpath("//span[text()='" + category + "']")));
                                BrowserUtils.hover(subCatListW.get(1));
                            }
                            break;
                    }
                }
                break;
            case "Men":
                for (WebElement element : subCatListM) {
                    switch (subCat) {
                        case "Tops":
                            for (WebElement webElement : nestedSubCatListMT) {
                                webElement.click();
                                BrowserUtils.hover(Driver.get().findElement(By.xpath("//span[text()='" + category + "']")));
                                BrowserUtils.hover(subCatListM.get(0));
                            }
                            break;
                        case "Buttoms":
                            for (WebElement webElement : nestedSubCatListMB) {
                                webElement.click();
                                BrowserUtils.hover(Driver.get().findElement(By.xpath("//span[text()='" + category + "']")));
                                BrowserUtils.hover(subCatListM.get(1));
                            }
                            break;
                    }
                }
                break;
            case "Gear":
                for (WebElement element : subCatListG) {
                    element.click();
                    BrowserUtils.hover(Driver.get().findElement(By.xpath("//span[text()='" + category + "']")));

                }
                break;
            case "Training":
                for (WebElement element : subCatListT) {
                    element.click();
                }
                break;
            case "Sale":
                break;

        }
    }
}
}
