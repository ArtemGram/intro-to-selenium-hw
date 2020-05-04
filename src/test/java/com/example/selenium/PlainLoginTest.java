package com.example.selenium;

import org.testng.annotations.Test;

public class PlainLoginTest extends  BaseTest{
    private static final String LOGIN = "tomsmith";
    private static final String PASSWORD = "SuperSecretPassword!";

    @Test
    public void loginLogin() {
        loginPageSteps.loginWith(LOGIN,PASSWORD)
                .logout();
    }
}
