package com.example.selenium.steps;

import com.example.selenium.pages.LoginPage;
import com.example.selenium.pages.MainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;

public class UserSteps {
    private WebDriver driver;
    LoginPage loginPage;
    MainPage mainPage;

    public UserSteps(WebDriver driver) {
        this.driver = driver;
    }

    public UserSteps login(String username, String password) {
        mainPage = new MainPage(driver);
        loginPage = new LoginPage(driver);

        loginPage.setUsername("tomsmith")
                .setPassword("SuperSecretPassword!")
                .clickLogin();
        assertEquals(driver.findElement(By.cssSelector("h2")).getText(), "Secure Area", "Login failed");

        return this;
    }

    public UserSteps logout() {
        mainPage.clickLogout();
        return this;
    }
}
