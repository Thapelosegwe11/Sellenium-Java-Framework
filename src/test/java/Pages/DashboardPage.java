package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DashboardPage {

    //1. WebDriver variable

    WebDriver driver;
    WebDriverWait wait;

    //2.Constructor method.

    public DashboardPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    //3.Page elements

    By welcomePage_xpath = By.xpath("//h2");
    By learnDropdownButton_xpath = By.className("nav-dropdown-trigger");
    By learningMaterial_xpath = By.xpath("//button[contains(@class,'nav-dropdown-item')][.//span[normalize-space()='Learning Materials']]");

    //4. Descriptive methods.

    public void verifyHomeContent(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(welcomePage_xpath)).isDisplayed();
    }

    public void clickLearnDropdownButton(){

        wait.until(ExpectedConditions.elementToBeClickable(learnDropdownButton_xpath)).click();
    }

    public void clickLearningMaterial(){

       wait.until(ExpectedConditions.elementToBeClickable(learningMaterial_xpath)).click();
    }


}

