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
        landingPage.clickLearnDropDown();
        landingPage.clickLearningMaterials();
        learningMaterialPage.clickWebAutomationAdvanceOption();
        learningMaterialPage.selectDeviceTypeDropDown();
        learningMaterialPage.selectPhoneOption();
        learningMaterialPage.selectBrandDropDown();
        learningMaterialPage.selectAppleOption();
        learningMaterialPage.select128GBOption();
        learningMaterialPage.selectColorDropDown();
        learningMaterialPage.selectBlackOption();
        learningMaterialPage.clickQuantityInput();
        learningMaterialPage.clickAddressInput();
        learningMaterialPage.clickNextButton();
        learningMaterialPage.clickExpressShippingOption();
        learningMaterialPage.clickWarranty1YearOption();
        learningMaterialPage.enterDiscountCode("SAVE10");
        learningMaterialPage.clickApplyDiscountButton();
        learningMaterialPage.clickConfirmPurchaseButton();
        learningMaterialPage.clickViewInvoiceButton();



    }



}
