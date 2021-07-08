package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.BaseClass;
import com.bridgelabz.selenium.utility.Log;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {

    @FindBy(xpath = "//img[@id='ember34']")
    WebElement profile_dropdown;
    @FindBy(xpath = "//a[normalize-space()='Sign Out']")
    WebElement Sign_out;
    @FindBy(xpath = "//button[@id='ember412']")
    WebElement remember;


    public  HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }

    public String logout() throws InterruptedException {
        Log.info("Clicking on profile button");
        profile_dropdown.click();
        Thread.sleep(3000);
        Log.info("Clicking on sign out");
        Sign_out.click();
        Thread.sleep(1000);
        remember.click();
        Log.info("logout process ended");
        Thread.sleep(2000);
        return driver.getTitle();
    }
}
