package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.pages.HomePage;
import com.bridgelabz.selenium.pages.Login;
import com.bridgelabz.selenium.utility.listeners.TestListener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestListener.class)
public class Log4j_And_Reports_Test extends BaseClass {

    @Test (priority = 1)
    public void login() throws InterruptedException{
        Login login = new Login(driver);
        String actualTitle = login.login();
        String expectedTitle = "LinkedIn: Log In or Sign Up";
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println("Login Successfull..!");
    }

    @Test (priority = 2)
    public void logout() throws InterruptedException {
        Login login = new Login(driver);
        login.login();
        HomePage logout = new HomePage(driver);
        String actualTitle = logout.logout();
        String expectedTitle = "LinkedIn: Log In or Sign Up";
        Assert.assertEquals(actualTitle,expectedTitle);
        System.out.println("You are logout successfully..!!");

    }
}
