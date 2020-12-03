package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {
    By addCustomerBtn = By.xpath("//div[@class='center']//button[@ng-class='btnClass1']");
    By firstNameField = By.xpath("//div[@class='form-group']//input[@placeholder='First Name']");
    By lastNameField = By.xpath("//div[@class='form-group']//input[@placeholder='Last Name']");
    By postCodeField = By.xpath("//div[@class='form-group']//input[@placeholder='Post Code']");
    By addCustomerBtnFinal = By.xpath("//button[@type='submit']");
    // This method Clicks on Add To Customer Button
    public void clickOnAddCustomerButton(){
        Reporter.log("Clicks on Add Customer Button " + addCustomerBtn.toString()+"<br>");
        clickOnElement(addCustomerBtn);
    }
    //This method clicks and send text to First Name Field
    public void enterFirstName (){
        Reporter.log("Click on Add First Name Field " + firstNameField.toString() + "<br>");
        clickOnElement(firstNameField);
        sendTextToElement(firstNameField,"Alpha1");
    }
    //This method clicks and send text to Last Name Field
    public void enterLastName(){
        Reporter.log("Sends text to LastName Field " + lastNameField.toString() + "<br>");
        clickOnElement(lastNameField);
        sendTextToElement(lastNameField,"Beta1");
    }
    //This method clicks and send text to Post Code Field
    public void enterPostCode (){
        Reporter.log("send text to PostCode Field " + postCodeField.toString()+"<br>");
        clickOnElement(postCodeField);
        sendTextToElement(postCodeField,"AL1 6VB");
    }
    // This method clicks on Final Add Customer Button
    public void clickOnAddToCustomerFinalBtn(){
        Reporter.log("Clicks on Add to Customer Button" + addCustomerBtnFinal + "<br>");
        clickOnElement(addCustomerBtnFinal);
    }

    public void verifyPopUpMessage() {
        Alert alertDialog = driver.switchTo().alert();
        String alertText = alertDialog.getText();
        Assert.assertTrue(alertText.contains("Customer added successfully"));
        alertDialog.accept();
    }
}
