package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

public class CustomersPage extends Utility {
    By customerBtn = By.xpath("//div[@class='center']//button[@ng-class='btnClass3']");
    By searchField = By.xpath("//input[@placeholder='Search Customer']");
    By homePageBtn = By.xpath("//button[contains(text(),'Home')]");
    By logoutBtn = By.xpath("//button[contains(text(),'Logout')]");
    By expectedMessage = By.xpath("//label[contains(text(),'Your Name :')]");

    // This method clicks on Customer Button
    public void clickOnCustomerBtn() {
        Reporter.log("Click on Customer Button " + customerBtn.toString() + "<br>");
        clickOnElement(customerBtn);
    }
//This method searches on Customer Field

    public void searchCustomerFeild() {
        Reporter.log("Selects drop Down from Searches Customer Field " + searchField + "<br>");
        clickOnElement(searchField);
        sendTextToElement(searchField, "Alpha");
    }
    //Thsi method clickOnHomeButton

    public void clickonHomeButton() {
        clickOnElement(homePageBtn);
    }

    //This method to verify logout btn
        public By isLogoutDisplayed() {
        Reporter.log("verification of logout btn " + logoutBtn + "<br>");
        return logoutBtn;
    }

    public void verifyMessage(){
        String actualMessage = "Your Name :";
        Assert.assertEquals(actualMessage,getTextFromElement(expectedMessage));
    }


}