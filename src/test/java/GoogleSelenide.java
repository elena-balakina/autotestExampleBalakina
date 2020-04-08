import org.junit.Test;
import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

import org.openqa.selenium.By;

public class GoogleSelenide {
    @Test
    public void GoogleSearch() {
        open("http://google.com/ncr");
        $(By.name("q")).val("selenide").pressEnter();

        // $$("#ires .g").shouldHave(size(10));

        $("#ires .g").shouldBe(visible).shouldHave(
                text("Selenide: concise UI tests in Java"),
                text("selenide.org"));



    }
}

