package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.testng.Assert;

public class AdminPage extends Utility
{
    By systemUserText=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/h5[1]");
    By add= By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/button[1]");
    By addUser= By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/h6[1]");
    By userRoll =By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]");
    By employeeNameField =By.xpath("//input[@fdprocessedid='reroo']");
    By userName = By.xpath("//input[@fdprocessedid='vbj68']");
    By status=By.xpath("//div[@class='oxd-select-text-input']");
    By password=By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]/div[2]/input[1]");
    By confirmPassword = By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[2]/div[1]/div[2]/div[1]/div[2]/input[1]");
    By save= By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/div[3]/button[2]");
    By search =By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[2]/button[2]");
    By delete =By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[6]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/button[1]/i[1]");
    public void verifySystemUserText(){
        Assert.assertEquals("getTextFromAlert(systemUserText)","System Users");

    }
    public void addButtonClick(){
        clickOnElement(add);
    }
    public void verifyAddUser(){
      Assert.assertEquals(getTextFromElement(addUser),"Add User");
    }
    public void selectUserRollAdmin(){
        clickOnElement(userRoll);
        selectByVisibleTextFromDropDown(userRoll,"Admin");
    }
    public  void addEmployeeName(){
        sendTextToElement(employeeNameField,"Ananya Dash");
    }
    public void enterUserName(){
        sendTextToElement(userName,"Hima Patel");
    }
    public void selectstatus(){
        selectByVisibleTextFromDropDown(status,"Disable");
    }
    public void enterPassword(){
        sendTextToElement(password,"Ananya123");
    }
    public  void confirmPassword(){
        sendTextToElement(confirmPassword,"Ananya123");
    }
    public void clickOnSave() {
        clickOnElement(save);
    }
    public void clickOnSearch(){
        clickOnElement(search);
    }
    public void clickOnDelete(){
        clickOnElement(delete);
    }
}
