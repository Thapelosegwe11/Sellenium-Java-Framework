package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SubmissionsRecordPage {


    // My global variables.

    WebDriver driver;
    WebDriverWait wait;

    // Constructor method.
    public SubmissionsRecordPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    // page elements.

    By pageTitle_element = By.xpath("//h1[contains(text(),'Form Submission Record')]");


    //my methods.

    public void switchToNewTab(){
        String originalWindow = driver.getWindowHandle();

        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                driver.switchTo().window(windowHandle);
                break;
            }
        }
    }

    public void verifyPageLoaded(){
            wait.until(ExpectedConditions.visibilityOfElementLocated(pageTitle_element)).isDisplayed();
        }


    public void scrollToBottom() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

    }
}
