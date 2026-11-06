package tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;
import pages.LandingPage;
import pages.LearningMaterialPage;
import pages.LoginPage;
import utils.BrowserFactory;
import utils.ReadData;


public class Base {

    BrowserFactory browserFactory = new BrowserFactory();

    final WebDriver driver = browserFactory.startBrowser("Edge", "https://ndosisimplifiedautomation.vercel.app/");
    public HomePage homepage = PageFactory.initElements(driver, HomePage.class);
    public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
    public LandingPage landingPage = PageFactory.initElements(driver, LandingPage.class);
    public LearningMaterialPage learningMaterialPage = PageFactory.initElements(driver, LearningMaterialPage.class);




    public ReadData readData;

    public Base() {
        try {
            readData = new ReadData();
        } catch (Exception e) {
            throw new RuntimeException("Failed to load test data from Excel", e);
        }
    }
}
