package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility
{
    By usernameField =By.xpath("oxd-input-group__label-wrapper");
    By passwordField = By.xpath("//input[@placeholder='Password']");
    By loginbutton = By.xpath("//button[@type='submit']");
    By HrForAllLogo =By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[1]/img[1]");
    By logout =By.tagName("h5");
    By userProfileLogo =By.xpath("//body[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[2]/ul[1]/li[1]/span[1]/p[1]");

    public void sendTextToUsernameField(){
        sendTextToElement(usernameField,"Admin");
    }
    public void sendTextToPassField (){
        sendTextToElement(passwordField,"admin123");
    }
    public void clickOnLoginButton(){
        clickOnElement(loginbutton);
    }
public void mousehoveronLogOut(){
        mouseHoverToElementAndClick(logout);
}
public  void userProfileLogo(){
        clickOnElement(userProfileLogo);
}
}
