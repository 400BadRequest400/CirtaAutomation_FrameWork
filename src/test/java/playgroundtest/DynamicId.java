package playgroundtest;

import base.CommonAPI;
import org.testng.annotations.Test;
import playground.PlayGroundPage;

public class DynamicId extends CommonAPI {


    @Test
    public void dynamicIdTest(){
        PlayGroundPage playGroundPage = new PlayGroundPage(getDriver());
        playGroundPage.clickOndynamicIdButton();
        playGroundPage.clickOnButtonWithDynamicId();
    }

}
