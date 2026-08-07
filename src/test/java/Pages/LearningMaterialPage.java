package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LearningMaterialPage {

    //1.Global variables.

    WebDriver driver;
    WebDriverWait wait;


    //Constructor
    public LearningMaterialPage(WebDriver driver){
         this.driver = driver;
         this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
     }

     //2.Page elements

    By basicFormButton_element = By.id("tab-btn-password");


    //3.Constructive method

    public void clickBasicFormButton(){
        wait.until(ExpectedConditions.elementToBeClickable(basicFormButton_element)).click();
    }


}
