package datadriventest;

import base.CommonAPI;
import utility.ExcelReader;
import datadriven.DataSource;
import org.testng.annotations.Test;

import java.util.List;


public class ExcelDataTest extends CommonAPI {

    static String path = "/Users/djafarouldslimane/IdeaProjects/CirtaAutomation_FrameWork/data/Book5.xlsx";

    @Test
    public void searchItemByGettingDataFromCell(){

        ExcelReader excelReader = new ExcelReader(path);
        String feature = excelReader.getDataFromCell("Sheet1", 1, 1);
        System.out.println("the feature to look for is   : "+feature);
        DataSource dataSource = new DataSource(getDriver());
        dataSource.clickOnSearchButton();
        dataSource.searchElementAndEnter(feature);
    }

    //@Test
    public void searchItemByGettingEntireColumnData(){

        ExcelReader excelReader = new ExcelReader(path);
        List<String> features = excelReader.getEntireColumnData("Sheet1", 1, 1);
        DataSource dataSource = new DataSource(getDriver());
        dataSource.clickOnSearchButton();
        dataSource.searchElementAndEnter("checking");
        waitFor(2);
        for (String feature : features) {
            dataSource.clearField();
            waitFor(2);
            dataSource.searchSecondElementAndEnter(feature);
            waitFor(2);
        }
    }

    //@Test
    public void searchItemByGettingEntireColumnForGivenHeader(){

        ExcelReader excelReader = new ExcelReader(path);
        List<String> features = excelReader.getEntireColumnForGivenHeader("Sheet1", "feature name");
        DataSource dataSource = new DataSource(getDriver());
        dataSource.clickOnSearchButton();
        dataSource.searchElementAndEnter("checking");
        waitFor(2);
        for (String feature : features) {
         dataSource.clearField();
         waitFor(2);
         dataSource.searchSecondElementAndEnter(feature);
         waitFor(2);
        }
    }

    //@Test
    public void searchItemByGettingValueForGivenHeaderAndKey(){

        ExcelReader excelReader = new ExcelReader(path);
        String feature = excelReader.getValueForGivenHeaderAndKey("Sheet1", "reference number", "ref004");
        System.out.println("the reference number correspond to ref004 is :");
        DataSource dataSource = new DataSource(getDriver());
        dataSource.clickOnSearchButton();
        waitFor(3);
        dataSource.searchElementAndEnter(feature);


    }

}
