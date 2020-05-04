package com.example.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage {

    @FindBy(how = How.ID, using = "username")
    private WebElement usernameTextField;

    @FindBy(how = How.ID, using = "password")
    private WebElement passwordTextField;

    @FindBy(how = How.CSS, using = ".fa")
    private WebElement loginButton;

    @FindBy(how = How.CSS , using = "h2")
    private WebElement element;

    public String getElementText() {
        return element.getText();
    }

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage setUsernameTextField(String text) {
        usernameTextField.sendKeys(text);
        return this;
    }

    public LoginPage setPasswordTextField(String text) {
        passwordTextField.sendKeys(text);
        return this;
    }

    public MainPage clickLogin() {
        loginButton.click();
        return new MainPage(driver);
    }
}
