/*
 *Purpose : Class is implemented with page factory model to find the webElements
 *          by using locators in Login Page and implemented login method for logging into
 *          application.
 *
 * @author Vaishnavi Satish Birle
 * @version 1.0
 * @since 25-06-2021
 */
package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.utility.Log;
import jdk.jfr.Description;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*@Description-Created Login_Page Class for logging in the application
 * Created login method for logging into application
 * Created logout method for logging out from application.*/
@Description("Created Login class")

public class Login extends BaseClass {


    @FindBy(className = "nav__button-secondary")
    WebElement Sign_In;
    @FindBy(id = "username")
    WebElement email_or_username;
    @FindBy(id = "password")
    WebElement Password;
    @FindBy(className = "login__form_action_container")
    WebElement signin_btn;

    public  Login(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public String login() throws InterruptedException {
        Log.info("Clicking on SignIn button");
        Sign_In.click();
        Thread.sleep(1000);
        Log.info("Sending email using sendKeys");
        email_or_username.sendKeys("vaishnavibirle1133@gmail.com");
        Log.info("sending password using sendKeys");
        Password.sendKeys("vaishnavi@123");
        Log.info("clicking on signIn for logging into application");
        signin_btn.click();
        Thread.sleep(2000);
        Log.info("getting title of page");
        return driver.getTitle();
    }
}
