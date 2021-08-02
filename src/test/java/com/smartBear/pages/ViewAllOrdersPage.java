package com.smartBear.pages;

import com.smartBear.urilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewAllOrdersPage {
    public ViewAllOrdersPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='View all orders']")
    public WebElement viewOrderPage;

    @FindBy(xpath = "(//td)[4]")
    public WebElement verifyName;


    public void verifyName (String name){
        viewOrderPage.click();
        String actual = verifyName.getText();
        Assert.assertEquals(actual,name);

    }
}
