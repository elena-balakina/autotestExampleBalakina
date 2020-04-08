package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WYSIWYGEditorPage {
    private WebDriver driver;
    private String editorIframeId = "mce_0_ifr";
    private By textArea = By.id("tinymce");
    private By increaseIndentButton = By.cssSelector("#mceu_12 button");

    public WYSIWYGEditorPage(WebDriver driver) {
        this.driver = driver;
    }

    // метод, чтобы "зайти" во фрейм с основной страницы
    private void switchToEditArea() {
        driver.switchTo().frame(editorIframeId);
    }

    // метод, чтобы уйти с фрейма на основную страницу
    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }

    public void clearTextArea() {
        switchToEditArea();
        driver.findElement(textArea).clear();
        // уйти с фрейма на основную страницу
        switchToMainArea();
    }

    public void setTextArea(String text) {
        switchToEditArea();
        driver.findElement(textArea).sendKeys(text);
        // уйти с фрейма на основную страницу
        switchToMainArea();
    }

    public void increaseIndention() {
        driver.findElement(increaseIndentButton).click();
    }

    public String getTextFromEditor() {
        switchToEditArea();
        String text = driver.findElement(textArea).getText();
        switchToMainArea();
        return text;
    }
}
