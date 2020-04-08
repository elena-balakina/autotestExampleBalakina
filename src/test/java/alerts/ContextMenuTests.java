package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ContextMenuTests extends BaseTests {

    @Test
    public void testRightClick() {
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClickInBox();

        String message = contextMenuPage.getPopUpText();

        contextMenuPage.acceptPopUp();

        assertEquals(message, "You selected a context menu", "PopUp message is incorrect");
    }
}
