package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasicFormPage {

    //1.My global variables.
    WebDriver driver;
    WebDriverWait wait;

    //2.Constructor method.

    public BasicFormPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    //3.My page elements.

    By basicForm_element = By.id("page-title");
    By fullNameInput_element = By.id("name");
    By emailAddress_element = By.id("email");
    By ageInput_element = By.id("age");
    Select genderDropdown = new Select(driver.findElement(By.id("age")));
    Select countryDropdown = new Select(driver.findElement(By.id("country")));
    Select experienceDropdown = new Select(driver.findElement(By.id("experience")));

    // Checkbox elements

    WebElement pythonCheckbox = driver.findElement(By.id("skill-python"));
    WebElement javaCheckbox = driver.findElement(By.id("skill-java"));
    WebElement seleniumCheckbox = driver.findElement(By.id("skill-selenium"));

}
