package homepage;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogInPage extends CommonAPI {
    private final Logger logger = LoggerFactory.getLogger(LogInPage.class);

    public LogInPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "/html/body/header/nav/div[1]/div[1]/div/a[3]")
    private WebElement logiInButton;

    public void clickOnLogInButton(){
        click(logiInButton);
    }

}
