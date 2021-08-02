package com.smartBear.pages;

import com.smartBear.urilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SmartBear_WebOrdersPage {
    public SmartBear_WebOrdersPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[.='Order']")
    public WebElement orderLink;
}
