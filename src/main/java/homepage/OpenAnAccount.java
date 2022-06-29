package homepage;

import base.CommonAPI;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OpenAnAccount extends CommonAPI {

    private final Logger logger = LoggerFactory.getLogger(OpenAnAccount.class);

    public OpenAnAccount(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='dl-button dl-button-full-size dl-button-primary']")
    private WebElement accountButton;

    @FindBy(xpath = "//span[contains(text(),'Brokerage account')]")
    private WebElement brokerageAccount;

    @FindBy(xpath = "//span[contains(text(),'Bank account')]")
    private WebElement bankAccount;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    private WebElement continueButton;

    @FindBy(xpath = "//*[@id=\"application\"]/section/div[2]/div/div/div[2]/div/button")
    private WebElement nextContinueButton;

    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    private WebElement thirdContinueButton;



    @FindBy(css = "#\\39 Oz4aCSSzCRTPsqFwBsbd")
    private WebElement prefixButton;

    public void clickOnAccountButton(){
        click(accountButton);
        logger.info("successfuly clicked on account button");
    }
    public void uncheckedBrokerageAcountBox(){
        click(brokerageAccount);
        logger.info("brokerage account box unchecked ");
    }
    public void checkOnBankAccountBox(){
        click(bankAccount);
        logger.info("Bank Account Box Checked");
    }
    public void clickOnContinueButton(){
        click(continueButton);
        logger.info("Continue Button Has Been Clicked");
    }
    public void clickOnNextContinueButton(){
//        JavascriptExecutor js = (JavascriptExecutor) getDriver();
//        js.executeScript("window.scrollBy(0,2000)");
        click(nextContinueButton);
        logger.info("Next Continue Button Has Been Clicked");
    }
    public void clickOnThirdContinueButton(){
        click(thirdContinueButton);
        logger.info("third Continue Button Has Been Clicked");
    }

    public void contactInformation(){
        //Select select = new Select(prefixButton);
        //select.selectByIndex(1);
        //select.selectByVisibleText("Mr.");
        click(prefixButton);
    }

}
