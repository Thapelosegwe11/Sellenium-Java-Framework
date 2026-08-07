package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage {

    //1. initiate WebDriver as a global variable.

    WebDriver driver;

    //2. Create constructor method to instantiate our objects.

    public LoginFormPage(WebDriver driver){

        this.driver = driver;
    }

    //3. Define all page elements

    By username_id = By.id("login-email");
    By password_id = By.id("login-password");
    By loginButton_name = By.name("loginSubmit");

    //4.Create descriptive methods.

    public void loginToWebsite(String username, String password){
        driver.findElement(username_id).sendKeys();
        driver.findElement(password_id).sendKeys(password);
        driver.findElement(loginButton_name).click();

    }
    public  void enterUsername(String username){

        driver.findElement(username_id).sendKeys(username);
    }

    public void enterPassword(String password){

        driver.findElement(password_id).sendKeys(password);
    }

    public void clickSubmit(){

        driver.findElement(loginButton_name).click();
    }
}
