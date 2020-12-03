package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {
    By customerLoginBtn = By.xpath("//button[contains(text(),'Customer Login')]");
    By yourNameDropDown = By.xpath("//select[@id='userSelect']");
    By loginBtn = By.xpath("//button[contains(text(),'Login')]");

    // This method clicks on Customer Login button
    public void clickOnCustomerLoginBtn() {
        Reporter.log("Clicks on Customer Login Button " + customerLoginBtn.toString() + "<br>");
        clickOnElement(customerLoginBtn);
    }
    // This method selects name from DropDown
    public void selectYourNameDropDown() {
        Reporter.log("Selects from Drop Down " + yourNameDropDown.toString() + "<br>");
        selectByIndexFromDropDown(yourNameDropDown, 0);
    }
     // This method clicks on Login Button
    public void clickOnLoginBtn() throws InterruptedException {
        Reporter.log("Clicks on Login Button " + loginBtn.toString() + "<br>");
        //waitFor(10);
        clickOnElement(loginBtn);
    }
}
