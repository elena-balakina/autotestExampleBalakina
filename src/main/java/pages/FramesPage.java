package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FramesPage {
    private WebDriver driver;
    private By nestedPageLink = By.linkText("Nested Frames");

    public FramesPage(WebDriver driver) {
        this.driver = driver;
    }

    public NestedFramesPage clickNestedFrames() {
        driver.findElement(nestedPageLink).click();
        return new NestedFramesPage(driver);
    }
}
