import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YandexOpenAndCheck {
    @Test
    public void main() {
        System.out.println("Hello");
        System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\old_chromedriver\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        // C:\webdrivers
        webDriver.get("https://yandex.ru/");
        webDriver.manage().window().maximize();

        Assert.assertEquals("https://yandex.ru/", webDriver.getCurrentUrl());

        WebElement searchLine = webDriver.findElement(By.id("text"));
        searchLine.sendKeys("selenium");
        searchLine.sendKeys(Keys.RETURN);

        Assert.assertTrue("selenium.dev", webDriver.getPageSource().contains("selenium.dev"));

        webDriver.findElement(By.linkText("Selenium — Википедия")).click();


    }
}
