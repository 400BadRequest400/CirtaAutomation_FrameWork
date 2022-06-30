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
    @FindBy(xpath = "//h2[contains(text(),'Log on')]")
    private WebElement logVerification;
    @FindBy(xpath = "//input[@id='user_orig']")
    private WebElement userId;
    @FindBy(xpath = "//*[@id=\"log-on-form\"]/div[1]/div/div/div[2]/div/input")
    private WebElement password;
    @FindBy(xpath = "//*[@id=\"log-on-form\"]/div[3]/div/div/div[2]/div/div/select")
    private WebElement goToOption;
    @FindBy(xpath = "//button[@id='logon_button']")
    private WebElement marketsLogOnButton;
    @FindBy(xpath = "/html/body/div[3]/section/div[1]/div[3]/div/div/div/h4")
    private WebElement textVerification;

    public void clickOnLogInButton(){
        click(logiInButton);
        logger.info("Clicked on log in button");
    }
    public String logInVerification(){
        return getElementText(logVerification);
    }
    public void userIdField(String email){
        type(userId, email);
        logger.info("input a user email id");
    }
    public void passwordField(String pass){
        type(password, pass);
        logger.info("password typed");
    }
    public void marketsOption(){
        selectFromDropdown(goToOption, "Markets");
        logger.info("markets option selected");
    }
    public void clickOnLogOnButtonMarkets(){
        click(marketsLogOnButton);
        logger.info("clicked on log on button successfuly");
    }
    public String textLogInVerification(){
        return getElementText(textVerification);
    }

}
