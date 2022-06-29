package homepagetest;

import base.CommonAPI;
import homepage.LogInPage;
import homepage.OpenAnAccount;
import org.testng.annotations.Test;

public class LogInPageTest extends CommonAPI {

    @Test
    public void AccountLogIn(){

        LogInPage logInPage = new LogInPage(getDriver());

        logInPage.clickOnLogInButton();
    }
}
