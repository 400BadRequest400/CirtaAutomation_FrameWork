package datadriven;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class DataSource extends CommonAPI {

    private final Logger logger = LoggerFactory.getLogger(DataSource.class);


    @FindBy(xpath = "//*[@id=\"search-trigger\"]")
    private WebElement searchButton;
    @FindBy(css = "#search-by-prospect")
    private WebElement searchField;
    @FindBy(css = "#search-box")
    private WebElement searchSecondField;

    public DataSource(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void clickOnSearchButton(){
        logger.info("search button successfuly clicked");
        click(searchButton);
    }

    public void searchElementAndEnter(String text){
        logger.info("typed successfuly on search field");
        typeAndEnter(searchField, text);
    }

    public void searchSecondElementAndEnter(String text){
        logger.info("typed successfuly on second search field");
        typeAndEnter(searchSecondField, text);
    }
    public void clearField(){
        logger.info("the second search field cleared successfuly");
        clear(searchSecondField);
    }

    public static List<String> itemList(){

        List<String> items = new ArrayList<>();
        items.add("retirement");
        items.add("home loan");
        items.add("investment");
        items.add("auto loans");
        return items;
    }

    public void searchMultipleFeatures(String str){
        logger.info("search multiple feature passed");
        List<String> it = DataSource.itemList();

        click(searchButton);
        typeAndEnter(searchField, str);
        waitFor(3);

        for (String item : it) {
            clear(searchSecondField);
            waitFor(3);
            typeAndEnter(searchSecondField, item);
            waitFor(3);
            clear(searchSecondField);
        }
    }
}
