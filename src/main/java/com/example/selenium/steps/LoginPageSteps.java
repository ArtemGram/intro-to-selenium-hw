package com.example.selenium.steps;

import com.example.selenium.pages.LoginPage;
import com.example.selenium.pages.MainPage;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;

public class LoginPageSteps {
    private WebDriver driver;
    LoginPage loginPage;
    MainPage mainPage;

    public LoginPageSteps(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPageSteps loginWith(String username, String password) {
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);

        loginPage.setUsernameTextField(username)
                .setPasswordTextField(password)
                .clickLogin();
        assertEquals(loginPage.getElementText(), "Secure Area", "Login failed");

        return this;
    }

    public LoginPageSteps logout() {
        mainPage.clickLogout();
        return this;
    }

}
