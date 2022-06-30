package playgroundtest;

import base.CommonAPI;
import org.testng.annotations.Test;
import playground.PlayGroundPage;

public class ClassAtribute extends CommonAPI {

    @Test
    public void classAtributeTest(){
        PlayGroundPage playGroundPage = new PlayGroundPage(getDriver());
        playGroundPage.clickOnClassAtributeButton();
        playGroundPage.clickOnBlueButton();
        waitFor(2);

    }
}
