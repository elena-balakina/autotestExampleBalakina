package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWYSIWYGEditor() {
        var editorPage = homePage.clickWYSIWYGEditor();
        editorPage.clearTextArea();

        String text1 = "hello";
        editorPage.setTextArea(text1);

        editorPage.increaseIndention();

        String text2 = ", world!";
        editorPage.setTextArea(text2);

        assertEquals(editorPage.getTextFromEditor(), text1 + text2, "Text is incorrect");
    }

    @Test
    public void testFrames() {
        var nestedFramesPage = homePage.clickFrames().clickNestedFrames();

        assertEquals(nestedFramesPage.getLeftFrameText(), "LEFT", "Text in the left frame is incorrect");
        assertEquals(nestedFramesPage.getBottomFrameText(), "BOTTOM", "Text in the bottom frame is incorrect");
    }
}
