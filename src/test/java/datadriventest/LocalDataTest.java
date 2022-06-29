package datadriventest;

import base.CommonAPI;
import datadriven.DataSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

public class LocalDataTest extends CommonAPI {

    private final Logger LOG = LoggerFactory.getLogger(LocalDataTest.class);


    //@Test
    public void searchCheckingAccount(){
        DataSource localSource = new DataSource(getDriver());

        localSource.clickOnSearchButton();
        waitFor(3);
        localSource.searchElementAndEnter("checking account");
    }

    @Test
    public void searchMultipleFeaturesUsingLocalData(){

        LOG.info("test passed");
        DataSource localSource = new DataSource(getDriver());
        localSource.searchMultipleFeatures("checking account");
    }
}
