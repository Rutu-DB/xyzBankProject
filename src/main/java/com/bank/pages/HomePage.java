package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By homeButton = By.xpath("//button[contains(text(),'Home')]");
    By customerLoginBtn = By.xpath("//button[contains(text(),'Customer Login')]");
    By bankManagerLoginBtn = By.xpath("//button[contains(text(),'Bank Manager Login')]");

    //This method clicks on Customer Login Button
    public void clickOnCustomerLoginBtn() {
        clickOnElement(customerLoginBtn);
    }

    public void clickOnHomeButton() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(homeButton);
    }

    //This methid clicks on Bank Manager Login Button
    public void clickOnBankManagerLoginBtn() {
        clickOnElement(bankManagerLoginBtn);
    }
}
