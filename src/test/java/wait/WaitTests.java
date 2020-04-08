package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden() {
        var loadingPage = homePage.clickDynamicLoading().clickExample1();

        loadingPage.clickStartButton();

        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Text has not been appeared on the page");
    }

    @Test
    public void testWaitUntilRendered() {
        var loadingPage = homePage.clickDynamicLoading().clickExample2();

        loadingPage.clickStartButton();

        assertEquals(loadingPage.getLoadedText(), "Hello World!", "Text has not been appeared on the page");
    }
}
