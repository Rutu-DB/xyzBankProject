package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

public class OpenAccountPage extends Utility {
    By openAccountBtn = By.xpath("//div[@class='center']//button[@ng-class='btnClass2']");
    By customerNameDropDown = By.xpath("//select[@id='userSelect']");
    By currencyDropDown = By.xpath("//select[@id='currency']");
    By processBtn = By.xpath("//button[contains(text(),'Process')]");

    //This method clicks on Open Account Button
    public void clickOnOpenAccountBtn() {
        Reporter.log("Clicks on Open Account Button " + openAccountBtn.toString() + "<br>");
        clickOnElement(openAccountBtn);
    }

    //This method selects Customer Name from DropDown
    public void selectCustomerName() {
        Reporter.log("Selects Customer Name from Drop Down " + customerNameDropDown.toString() + "<br>");
        clickOnElement(customerNameDropDown);
        selectByIndexFromDropDown(customerNameDropDown, 6);
    }

    //This method selects Currency from DropDown
    public void selectCurrencyDropDown() {
        Reporter.log("Selects Currency Drop Down " + currencyDropDown.toString() + "<br>");
        selectByIndexFromDropDown(currencyDropDown, 1);
    }

    // This method clicks on Process Button
    public void clickOnProcessBtn() {
        Reporter.log("Clicks on Process Button " + processBtn.toString() + "<br>");
        clickOnElement(processBtn);
    }

    public void verifyPopUpMessage() {
        Alert alertDialog = driver.switchTo().alert();
        String alertText = alertDialog.getText();
        Assert.assertTrue(alertText.contains("Account created successfully"));
        alertDialog.accept();

    }
}