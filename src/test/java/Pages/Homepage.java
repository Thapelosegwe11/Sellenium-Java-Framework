package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homepage {

    // Call driver as a global variable to use in class

    WebDriver driver;
    WebDriverWait wait;

    //2. Constructor method to initialise class objects

    public Homepage(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    //3. Define all my page elements.

    By homeScreen_xpath = By.xpath("//button[@class='nav-item active']/span[contains(text(),'Home')]");

    By mainLoginButton_xpath = By.xpath("//div[@class='nav-user-section']/button/span[contains(text(),'Login')]");


    //4. Create descriptive methods.

    public void verifyHomeScreenContent(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(homeScreen_xpath)).isDisplayed();
    }

    public void clickMainLoginButton(){

        driver.findElement(mainLoginButton_xpath).click();
    }

}
