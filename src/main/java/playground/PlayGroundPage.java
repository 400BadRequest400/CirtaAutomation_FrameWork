package playground;

import base.CommonAPI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlayGroundPage extends CommonAPI {

    private final Logger logger = LoggerFactory.getLogger(PlayGroundPage.class);

    public PlayGroundPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[contains(text(),'Dynamic ID')]")
    private WebElement dynamicIdButton;
    @FindBy(xpath = "//button[@class='btn btn-primary']")
    private WebElement buttonWithDynamicId;

    @FindBy(xpath = "//a[contains(text(),'Class Attribute')]")
    private WebElement classAtrribute;
    @FindBy(xpath = "//button[contains(concat(' ', normalize-space(@class), ' '), ' btn-primary ')]")
    private WebElement blueButton;

    public void clickOndynamicIdButton(){
        click(dynamicIdButton);
        logger.info("clicked on dynamic id");
    }
    public void clickOnButtonWithDynamicId(){
        click(buttonWithDynamicId);
        logger.info("the dynamic id button has been clicked successfully");
    }
    public void clickOnClassAtributeButton(){
        click(classAtrribute);
        logger.info("Class Attribute Button clicked successfully");
    }
    public void clickOnBlueButton(){
        click(blueButton);
        logger.info("clicked on blue button");
    }
}
