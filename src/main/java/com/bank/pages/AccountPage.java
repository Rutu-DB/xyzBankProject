package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;

public class AccountPage extends Utility {

    By depositClick = By.xpath("//button[2][contains(text(),'Deposit')]");
    By depositAmount = By.xpath("//div[@class='form-group']/input");
    By depositFinalClick = By.xpath("//form[@name='myForm']/button");
    By getMessageDeposit = By.xpath("//span[contains(text(),'Deposit Successful')]");
    By withdrawalBtn =By.xpath("//button[3][contains(text(),'Withdraw')]");
    By withdrawalAmount =By.xpath("//div[@class='form-group']/input");
    By withdrawalFinalClick = By.xpath("//form[@name='myForm']/button");
    By getMessage = By.xpath("//span[contains(text(),'Transaction successful')]");



    //This method will click to deposit Tab
    public void clickOnDepositTab() {
        Reporter.log("clicking on deposit" + depositClick + "<br>");
        clickOnElement(depositClick);
    }

    //This method will deposit money
    public void depositMoney(String money) {
        Reporter.log("deposit money " + depositAmount + "<br>");
        sendTextToElement(depositAmount, money);
    }

    public void clickOnDepositFinalTab() {
        Reporter.log("clicking on deposit" + depositFinalClick + "<br>");
        clickOnElement(depositFinalClick);
    }

    public String getMessageToVerifyDeposit() {
        Reporter.log("get message to verify" + getMessageDeposit + "<br>");
        return getTextFromElement(getMessageDeposit);
    }


    //This method will click on withdrawal btn
    public void clickToWithdrawalBtn(){
        Reporter.log("clicking on Withdrawal btn"+withdrawalBtn+"<br>");
        clickOnElement(withdrawalBtn);

    }
    //This method will withdrawal amount
    public void enterWithdrawalAmount(String withdrawal){
        Reporter.log("enter Withdrawal amount"+withdrawalAmount+"<br>");
        sendTextToElement(withdrawalAmount,withdrawal);
    }
    public void clickOnWithdrawalFinalTab() {
        Reporter.log("clicking on Withdrawal" + withdrawalFinalClick + "<br>");
        clickOnElement(withdrawalFinalClick);
    }

    public String getMessageToVerify() {
        Reporter.log("get message to verify" + getMessage + "<br>");
        return getTextFromElement(getMessage);
    }
}
