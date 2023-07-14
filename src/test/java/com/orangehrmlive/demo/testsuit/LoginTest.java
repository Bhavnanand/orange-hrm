package com.orangehrmlive.demo.testsuit;

import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage= new LoginPage();
    @Test
    public void verifyUserShouldLoginSuccessFully(){

//Enter username
        loginPage.sendTextToUsernameField();
//   Enter password
        loginPage.sendTextToPassField();
//   Click on Login Button
        loginPage.clickOnLoginButton();
//   Verify "Dashboard" Message
    }
    @Test
    public void  VerifyThatTheLogoDisplayOnLoginPage(){
//Launch the application

//   Verify Logo is Displayed
    }
    @Test
    public void VerifyUserShouldLogOutSuccessFully()
    {
        // Login To The application
        loginPage.sendTextToUsernameField();
        loginPage.sendTextToPassField();
        loginPage.clickOnLoginButton();
        //   Click on User Profile logo
        loginPage.userProfileLogo();

        //   Mouse hover on "Logout" and click
        loginPage.mousehoveronLogOut();
        //   Verify the text "Login Panel" is displayed

    }
}
