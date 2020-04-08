package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;
import pages.RetrievePasswordPage;
import pages.SecureAreaPage;

import static org.junit.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testEmailSuccessfullySent(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();

        String email = "tau@gmail.com";
        forgotPasswordPage.setEmail(email);

        RetrievePasswordPage retrievePasswordPage = forgotPasswordPage.clickRetrievePassword();
        assertTrue("Asset text is incorrect", retrievePasswordPage.getAlertText().contains("Your e-mail's been sent!"));
    }
}
