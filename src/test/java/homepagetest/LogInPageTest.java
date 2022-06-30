package homepagetest;

import base.CommonAPI;
import homepage.LogInPage;
import homepage.OpenAnAccount;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInPageTest extends CommonAPI {

    @Test
    public void AccountLogIn(){

        LogInPage logInPage = new LogInPage(getDriver());
        logInPage.clickOnLogInButton();
        String expectedText = "Log on";
        Assert.assertEquals(expectedText, logInPage.logInVerification(), "log in button passed");
        logInPage.userIdField("etradebank@gmail.com");
        logInPage.passwordField("EtradePassword");
        logInPage.marketsOption();
        logInPage.clickOnLogOnButtonMarkets();
        String expectedResult1 = "Sorry! We're having trouble logging you on right now.";
        Assert.assertEquals(expectedResult1, logInPage.textLogInVerification(), "test passed");
    }

}
