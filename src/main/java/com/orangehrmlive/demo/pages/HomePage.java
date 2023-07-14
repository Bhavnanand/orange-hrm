package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By search= By.xpath("//input[@class='oxd-input oxd-input--active']");
    By admin =By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]");
    By xpathIM= By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]");
    By leave= By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[3]/a[1]/span[1]");
    By dashboard= By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[8]/a[1]/span[1]");
public void clickOnAdmintab(){
    clickOnElement(admin);
}
public void verifySystemUsersText(){

}
public void launchApplication(){

}
}
