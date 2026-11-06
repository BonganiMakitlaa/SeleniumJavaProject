package tests;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LandingPage;
import pages.LoginPage;
import utils.BrowserFactory;
import utils.ReadData;
@Test
public class LoginTests extends Base {
    public void validLoginTest() throws InterruptedException {
        homepage.clickLoginButton();



    }



}
