package hovers;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;
import static org.testng.Assert.assertEquals;

public class HoversTests extends BaseTests {

    @Test
    public void testHoverUser1() {
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);

        assertTrue("Caption is not displayed", caption.isCaptionDisplayed());
        assertEquals(caption.getTitle(), "name: user1", "Caption's title incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption's link text incorrect");
        assertTrue("Link is incorrect", caption.getLink().endsWith("/users/1"));
    }
}
