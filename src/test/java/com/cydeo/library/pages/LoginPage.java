package com.cydeo.library.pages;

import com.cydeo.library.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    @FindBy(xpath = "//label[text()='Email address']")
    public WebElement userNameInput;

    @FindBy(xpath = "//label[text()='Password']")
    public WebElement passwordInput;

    @FindBy(xpath = "//button")
    public WebElement signInBtn;

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }
}
