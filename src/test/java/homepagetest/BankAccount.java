package homepagetest;

import base.CommonAPI;
import homepage.OpenAnAccount;
import org.testng.annotations.Test;

public class BankAccount extends CommonAPI {


    @Test
    public void openBankAccount(){
        OpenAnAccount openAnAccount = new OpenAnAccount(getDriver());

        openAnAccount.clickOnAccountButton();
        waitFor(2);
        openAnAccount.uncheckedBrokerageAcountBox();
        waitFor(2);
        openAnAccount.checkOnBankAccountBox();
        waitFor(2);
        openAnAccount.clickOnContinueButton();
        waitFor(2);
        openAnAccount.clickOnNextContinueButton();
        waitFor(2);
        openAnAccount.clickOnThirdContinueButton();
        waitFor(2);
        openAnAccount.contactInformation();
    }
}
