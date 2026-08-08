package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginFormPage {

    //1. initiate WebDriver as a global variable.

    WebDriver driver;
    WebDriverWait wait;

    //2. Create constructor method to instantiate our objects.

    public LoginFormPage(WebDriver driver){

        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    //3. Define all page elements

    By username_id = By.id("login-email");
    By password_id = By.id("login-password");
    By loginButton_name = By.name("loginSubmit");

    //4.Create descriptive methods.

    public void loginToWebsite(String username, String password) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(username_id)).sendKeys(username);
        driver.findElement(password_id).sendKeys(password);
        driver.findElement(loginButton_name).click();

    }
}
