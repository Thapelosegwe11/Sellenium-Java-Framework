package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

    //Comment Input element.

    WebElement commentInput_element = driver.findElement(By.id("comments"));

    // Extra check boxes elements.

    WebElement newsLetterSub_element = driver.findElement(By.id("newsletter"));
    WebElement terms_element = driver.findElement(By.id("terms"));

    //Alert Buttons elements

    WebElement submitButton_element = driver.findElement(By.id("submit-btn"));
    WebElement validateAlertButton_element = driver.findElement(By.id("validate-btn"));
    WebElement testAlertButton_element = driver.findElement(By.id("alert-btn"));
    WebElement successAlertButton_element = driver.findElement(By.id("success-alert-btn"));




    //Descriptive methods.


    public void verifyBasicFormContent(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(basicForm_element)).isDisplayed();
    }

    public void enterFullname(String fullname){
        driver.findElement(fullNameInput_element).sendKeys(fullname);
    }

    public void enterEmail(String email){
        driver.findElement(emailAddress_element).sendKeys(email);
    }

    public void enterAge(String age){
        driver.findElement(ageInput_element).sendKeys(age);
    }

    public void selectGender(){
        genderDropdown.selectByValue("male");
    }

    public void selectCountry(){
        countryDropdown.selectByValue("south-africa");
    }

    public void selectExperience(){
        experienceDropdown.selectByValue("beginner");
    }

    public void tickJavaSkill(){
        if(javaCheckbox.isSelected()){
            javaCheckbox.click();
        }
    }

    public void tickPythonSkill(){
        if(pythonCheckbox.isSelected()) {
            pythonCheckbox.click();
        }
    }

    public void tickSeleniumSkill(){
        if (seleniumCheckbox.isSelected()){
        seleniumCheckbox.click();
        }
    }

    public void writeComment(){
        commentInput_element.sendKeys("Test Automation is fun");
    }

    public void tickNewsLetterSubscribe(){
        if (newsLetterSub_element.isSelected()){
            newsLetterSub_element.click();
        }
    }

    public void tickTerms(){
        if (terms_element.isSelected()){
            terms_element.click();
        }
    }



}
