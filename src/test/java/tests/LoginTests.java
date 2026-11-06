package tests;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;
import utils.BrowserFactory;
import utils.ReadData;

import java.time.Duration;

public class LoginTests extends Base {


    @Test
    public void validLoginTest() throws InterruptedException {
        homepage.clickLoginButton();
        loginPage.enterUsername(readData.username);
        loginPage.enterPassword(readData.password);
        loginPage.clickLoginSubmitButton();
        landingPage.verifyLoginSuccess();








    }



}
