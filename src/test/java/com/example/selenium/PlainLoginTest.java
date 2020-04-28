package com.example.selenium;

import org.testng.annotations.Test;

public class PlainLoginTest extends  BaseTest{

    @Test
    public void loginLogin() {
        steps.login("tomsmith","SuperSecretPassword!")
                .logout();
    }
}
