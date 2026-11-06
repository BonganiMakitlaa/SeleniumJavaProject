package pages;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.Instant;

public class LearningMaterialPage {
    WebDriver driver;
    @FindBy(xpath =  "//span[normalize-space()='Web Automation Advance']")
    WebElement webAutomationAdvanceOption;

    @FindBy(id = "deviceType")
    WebElement deviceTypeDropdown;

    @FindBy(xpath = "//option[@value='phone']")
    WebElement phoneOption;

    @FindBy(id = "brand")
    WebElement brandDropdown;

    @FindBy(xpath = "//option[@value='apple']")
    WebElement appleOption;

    @FindBy(id = "storage-128GB")
    WebElement storage128GBOption;

    @FindBy(id = "color")
    WebElement colorDropdown;

    @FindBy(xpath = "//option[text()='Black']")
    WebElement blackOption;

    @FindBy(id = "quantity")
    WebElement quantityInput;

    @FindBy(id = "address")
    WebElement addressInput;

    @FindBy(id = "inventory-next-btn")
    WebElement nextButton;

    @FindBy(id = "shipping-express")
    WebElement expressShippingOption;

    @FindBy(id = "warranty-1yr")
    WebElement warranty1YearOption;

    @FindBy(id = "discount-code")
    WebElement discountCodeInput;

    @FindBy(id = "apply-discount-btn")
    WebElement applyDiscountButton;

    @FindBy(id = "purchase-device-btn")

    WebElement confirmPurchaseButton;

    @FindBy(xpath = "//button[@id='view-history-btn']")
    WebElement viewInvoice;

    public LearningMaterialPage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickWebAutomationAdvanceOption(){
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(webAutomationAdvanceOption)).click();
        webAutomationAdvanceOption.click();
    }

    public void selectDeviceTypeDropDown() {
        deviceTypeDropdown.click();

    }

    public void selectPhoneOption() {

        phoneOption.click();
    }
    public void selectBrandDropDown() {
        brandDropdown.click();

    }

    public void selectAppleOption() {
        appleOption.click();
    }
    public void select128GBOption() {
        storage128GBOption.click();
    }
    public void selectColorDropDown() {
        colorDropdown.click();
    }
    public void selectBlackOption() {
        blackOption.click();
    }

    public void clickQuantityInput() {
        quantityInput.click();
        quantityInput.sendKeys("2");

    }

    public void clickAddressInput() {
        addressInput.click();
        addressInput.sendKeys("123 Main St, Anytown, Tembisa");
    }
    public void clickNextButton() {
        nextButton.click();
    }
    public void clickExpressShippingOption() {
        expressShippingOption.click();
    }
    public void clickWarranty1YearOption() {
        warranty1YearOption.click();
    }

    public void enterDiscountCode(String discountCode) {
        discountCodeInput.sendKeys(discountCode);
    }
    public void clickApplyDiscountButton() {
        applyDiscountButton.click();
    }
    public void clickConfirmPurchaseButton() {
        confirmPurchaseButton.click();
    }
    public void clickViewInvoiceButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // 1. Wait for the button to be VISIBLE on the screen
        WebElement invoiceBtn = wait.until(ExpectedConditions.visibilityOf(viewInvoice));

        // 2. Try a normal click, if it fails, use a JavaScript click
        try {
            wait.until(ExpectedConditions.elementToBeClickable(invoiceBtn)).click();
        } catch (Exception e) {
            System.out.println("Normal click failed (popup animation or overlay blocked it). Using JavaScript click...");
            org.openqa.selenium.JavascriptExecutor js = (org.openqa.selenium.JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", invoiceBtn);
        }
    }

}
