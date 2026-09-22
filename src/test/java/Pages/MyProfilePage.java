package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MyProfilePage {

    //1.Globals.
    WebDriver driver;
    WebDriverWait wait;

    //2.Constructor method.

    public MyProfilePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(15));

    }

    //3.Page elements.


    By EditProfile_element = By.xpath("//button[contains(text(),'Edit Profile')]");
    By ChoosePhoto_element = By.id("profilePicture");

    //4.Descriptive Methods.

    public void clickEditProfile(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(EditProfile_element)).click();
    }

    public void clickChoosePhoto(){
        wait.until(ExpectedConditions.elementToBeClickable(ChoosePhoto_element)).click();
    }
}

