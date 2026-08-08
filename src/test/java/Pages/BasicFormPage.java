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
    By genderDropdown = By.id("gender");
    By countryDropdown = By.id("country");
    By experienceDropdown = By.id("experience");

    // Checkbox elements

    By pythonCheckbox = By.id("skill-python");
    By javaCheckbox = By.id("skill-java");
    By seleniumCheckbox = By.id("skill-selenium");

    //Comment Input element.

    By commentInput_element = By.id("comments");

    // Extra check boxes elements.

    By newsLetterSub_element = By.id("newsletter");
    By terms_element = By.id("terms");

    // page Buttons elements

    By validateAlertButton_element = By.id("validate-btn");
    By submitFormButton_element = By.id("submit-btn");

    // Submissions view elements

    By submissionsButton_element = By.id("submissions-toggle-btn");
    By viewSubmissionsButton_element = By.id("view-submission-0");


    //Alerts to handle on page

    By testAlertButton_element = By.id("alert-btn");
    By successAlertButton_element = By.id("success-alert-btn");




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
        Select select = new Select(driver.findElement(genderDropdown));
        select.selectByValue("male");
    }

    public void selectCountry(){
        Select select = new Select(driver.findElement(countryDropdown));
        select.selectByValue("south-africa");
    }

    public void selectExperience(){
        Select select = new Select(driver.findElement(experienceDropdown));
        select.selectByValue("intermediate");
    }

    public void tickJavaSkill(){
        WebElement element = driver.findElement(javaCheckbox);
        if(! element.isSelected()){
            element.click();
        }
    }

    public void tickPythonSkill(){
        WebElement element = driver.findElement(pythonCheckbox);
        if(!element.isSelected()) {
            element.click();
        }
    }

    public void tickSeleniumSkill(){
        WebElement element = driver.findElement(seleniumCheckbox);
        if (! element.isSelected()){
        element.click();
        }
    }

    public void writeComment(String comment){

        driver.findElement(commentInput_element).sendKeys(comment);
    }

    public void tickNewsLetterSubscribe(){
        WebElement element = driver.findElement(newsLetterSub_element);
        if (! element.isSelected()){
            element.click();
        }
    }

    public void tickTermsAndConditions(){
        WebElement element = driver.findElement(terms_element);
        if (! element.isSelected()){
            element.click();
        }
    }


    public void checkValidateButton(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(validateAlertButton_element)).click();
    }

    public void checkSubmitForm(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(submitFormButton_element)).click();
    }

    public void checkSubmissions(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(submissionsButton_element)).click();
    }

    public void checkViewSubmission(){

        wait.until(ExpectedConditions.visibilityOfElementLocated(viewSubmissionsButton_element)).click();
    }





    //Alert Buttons Methods
}
