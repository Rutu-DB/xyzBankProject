package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

import javax.rmi.CORBA.Util;

public class BankManagerLoginPage extends Utility {
    By bankManagerLoginBtn = By.xpath("//button[contains(text(),'Bank Manager Login')]");
    By openAccountBtn = By.xpath("//div[@class='center']//button[@ng-class='btnClass2']");
    By customerNameField =By.xpath("//select[@id='userSelect']");
    By currencyField = By.xpath("//select[@id='currency']");


    // This method clicks on Bank Manager Login Button
    public void clickOnBankManagerLoginBtn (){
        Reporter.log("Clicks on Managers Login Button " + bankManagerLoginBtn.toString()+ "<br>");
        clickOnElement(bankManagerLoginBtn);
    }
//This method clicks on Open Account Button
    public void clickOnOpenAccountBtn(){
        Reporter.log("Cicks on Open Account Button" + openAccountBtn.toString() + "<br>");
        clickOnElement(openAccountBtn);
    }
    //This method clicks on Customer Field
    public void selectCustomerNameFromDropdown(){
        Reporter.log("Selects Customer Name from Dropdown " + customerNameField.toString() + "<br>");
        clickOnElement(customerNameField);
    }
    //This method selects "pounds" from currency field
    public void selectCurrencyDropdown(){
        Reporter.log("Select Pound from Currency Dropdown " + currencyField.toString() + "<br>");
        selectByIndexFromDropDown(customerNameField,1);
    }

    public void verifyPopUpMessage() {
        Alert alertDialog = driver.switchTo().alert();
        String alertText = alertDialog.getText();
        Assert.assertTrue(alertText.contains("Customer added successfully"));
        alertDialog.accept();
    }

}
