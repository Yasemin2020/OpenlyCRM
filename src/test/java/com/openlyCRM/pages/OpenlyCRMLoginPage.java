package com.openlyCRM.pages;

import com.openlyCRM.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenlyCRMLoginPage {
    public OpenlyCRMLoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@placeholder='Login']")
    public WebElement inputUsername;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement loginButton;

}
