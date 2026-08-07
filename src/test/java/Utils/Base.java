package Utils;

import Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Base {

    public static final BrowserFactory factory = new BrowserFactory();

    public WebDriver driver;
    public Homepage homepage;
    public LoginFormPage loginFormPage;
    public DashboardPage dashboardPage;
    public LearningMaterialPage learningMaterialPage;
    public BasicFormPage basicFormPage;



    @BeforeClass
    public void setUp() {
        // 1. Open the browser
        driver = factory.launchBrowser("chrome", "https://ndosisimplifiedautomation.vercel.app/");

        // 2. Set up the pages
        homepage = PageFactory.initElements(driver, Homepage.class);
        loginFormPage = PageFactory.initElements(driver, LoginFormPage.class);
        dashboardPage = PageFactory.initElements(driver, DashboardPage.class);
        learningMaterialPage = PageFactory.initElements(driver, LearningMaterialPage.class);
        basicFormPage = PageFactory.initElements(driver, BasicFormPage.class);

    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}