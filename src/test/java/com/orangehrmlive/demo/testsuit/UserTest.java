package com.orangehrmlive.demo.testsuit;

import com.orangehrmlive.demo.pages.AdminPage;
import com.orangehrmlive.demo.pages.HomePage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class UserTest extends BaseTest {
    LoginPage loginPage=new LoginPage();
    HomePage homePage= new HomePage();
    AdminPage adminPage=new AdminPage();

    @Test
    public void adminShouldAddUserSuccessFully(){
        //Login to Application
        loginPage.sendTextToUsernameField();
        loginPage.sendTextToPassField();
        loginPage.clickOnLoginButton();
        //	click On "Admin" Tab
        homePage.clickOnAdmintab();
        //	Verify "System Users" Text
        adminPage.verifySystemUserText();
        //	click On "Add" button
        adminPage.addButtonClick();
        //	Verify "Add User" Text
        adminPage.verifyAddUser();
        //	Select User Role "Admin"
        adminPage.selectUserRollAdmin();
        //	enter Employee Name "Ananya Dash"
        adminPage.enterUserName();
        //	enter Username
        adminPage.enterUserName();
        //	Select status "Disable"
        adminPage.selectstatus();
        //	enter psaaword
        adminPage.enterUserName();
        //	enter Confirm Password
        adminPage.confirmPassword();
        //	click On "Save" Button
        adminPage.clickOnSave();
        //	verify message "Successfully Saved"
    }
@Test
    public void TheUserCreatedAndVerifyIt(){
        //Login to Application
    loginPage.sendTextToUsernameField();
    loginPage.sendTextToPassField();
    loginPage.clickOnLoginButton();
    //	click On "Admin" Tab
    homePage.clickOnAdmintab();
    //	Verify "System Users" Text
    adminPage.verifySystemUserText();
    //	Enter Username
    adminPage.enterUserName();
    //	Select User Role
    adminPage.selectUserRollAdmin();
    //	Select Satatus
    adminPage.selectstatus();
    //	Click on "Search" Button
    adminPage.clickOnSearch();
    //	Verify the User should be in Result list.
}
@ Test
    public  void verifyThatAdminShouldDeleteTheUserSuccessFully(){
     //Login to Application
    loginPage.sendTextToUsernameField();
    loginPage.sendTextToPassField();
    loginPage.clickOnLoginButton();
    //	click On "Admin" Tab
    homePage.clickOnAdmintab();
    //	Verify "System Users" Text
    adminPage.verifySystemUserText();
    //	Enter Username
    adminPage.enterUserName();
    //	Select User Role
    adminPage.selectUserRollAdmin();
    //	Select Satatus
    adminPage.selectstatus();
    //	Click on "Search" Button
    adminPage.clickOnSearch();
    //	Verify the User should be in Result list.
    //	Click on Check box

    //	Click on Delete Button
    adminPage.clickOnDelete();
    //	Popup will display
    //	Click on Ok Button on Popup
    //	verify message "Successfully Deleted"
}
@ Test
    public void  searchTheDeletedUserAndVerifyTheMessageNoRecordFound(){
      //Login to Application
    loginPage.sendTextToUsernameField();
    loginPage.sendTextToPassField();
    loginPage.clickOnLoginButton();
    //	click On "Admin" Tab
    homePage.clickOnAdmintab();
    //	Verify "System Users" Text
    adminPage.verifySystemUserText();
    //	Enter Username
    adminPage.enterUserName();
    //	Select User Role
    adminPage.selectUserRollAdmin();
    //	Select Satatus
    adminPage.selectstatus();
    //	Click on "Search" Button
    adminPage.clickOnSearch();
    //	verify message "No Records Found"
}

}
