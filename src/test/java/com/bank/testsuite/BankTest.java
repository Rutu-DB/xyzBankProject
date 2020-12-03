package com.bank.testsuite;

import com.bank.pages.*;
import com.bank.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankTest extends TestBase {
    BankManagerLoginPage bankManagerLoginPage = new BankManagerLoginPage();
    AddCustomerPage addCustomerPage = new AddCustomerPage();
    CustomersPage customersPage = new CustomersPage();
    HomePage homePage = new HomePage();
    OpenAccountPage openAccountPage = new OpenAccountPage();
    CustomerLoginPage customerLoginPage = new CustomerLoginPage();
    AccountPage accountPage = new AccountPage();

    @Test
    public void bankManagerShouldAddCustomerSuccessfully() {
        bankManagerLoginPage.clickOnBankManagerLoginBtn();
        addCustomerPage.clickOnAddCustomerButton();
        addCustomerPage.enterFirstName();
        addCustomerPage.enterLastName();
        addCustomerPage.enterPostCode();
        addCustomerPage.clickOnAddToCustomerFinalBtn();
        addCustomerPage.verifyPopUpMessage();

    }

    @Test
    public void bankManagerShouldOpenAccountSuccessfully() throws InterruptedException {
        bankManagerShouldAddCustomerSuccessfully();
        homePage.clickOnHomeButton();
        homePage.clickOnBankManagerLoginBtn();
        openAccountPage.clickOnOpenAccountBtn();
        openAccountPage.selectCustomerName();
        openAccountPage.selectCurrencyDropDown();
        openAccountPage.clickOnProcessBtn();
        openAccountPage.verifyPopUpMessage();
    }

    @Test
    public void customerShouldLoginAndLogoutSuccessfully() throws InterruptedException {
        bankManagerShouldAddCustomerSuccessfully();
        customersPage.clickonHomeButton();
        homePage.clickOnCustomerLoginBtn();
        openAccountPage.selectCustomerName();
        customerLoginPage.clickOnLoginBtn();
        customersPage.isLogoutDisplayed();
        customersPage.verifyMessage();
    }

    @Test
    public void customerShouldDepositMoneySuccessfully() throws InterruptedException {
        bankManagerShouldOpenAccountSuccessfully();
        customersPage.clickonHomeButton();
        homePage.clickOnCustomerLoginBtn();
        openAccountPage.selectCustomerName();
        customerLoginPage.clickOnLoginBtn();
        accountPage.clickOnDepositTab();
        accountPage.depositMoney("1000");
        accountPage.clickOnDepositFinalTab();
        String expectedMessage = "Deposit Successful";
        String actualMessage = accountPage.getMessageToVerifyDeposit();
        Assert.assertEquals(expectedMessage, actualMessage);

    }

    @Test
    public void customerShouldWithdrawMoneySuccessfully() throws InterruptedException {
        customerShouldDepositMoneySuccessfully();
        customersPage.clickonHomeButton();
        homePage.clickOnCustomerLoginBtn();
        openAccountPage.selectCustomerName();
        customerLoginPage.clickOnLoginBtn();
        accountPage.clickToWithdrawalBtn();
        accountPage.enterWithdrawalAmount("200");
        accountPage.clickOnWithdrawalFinalTab();
        String expectedMessage = "Transaction successful";
        String actualMessage = accountPage.getMessageToVerify();
        Assert.assertEquals(expectedMessage, actualMessage);

    }


}
