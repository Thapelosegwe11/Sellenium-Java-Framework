package TestRunners;

import Utils.Base;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BasicFormTests extends Base {



    @Test
    public void LoginViaTestUser() {
        loginFormPage.loginToWebsite("segwe.bz@gmail.com", "rA!ny@$14");

    }

    @Test(dependsOnMethods = "LoginViaTestUser")
    public void NavigateToLearningMaterials(){
        dashboardPage.clickLearnDropdownButton();
        dashboardPage.clickLearningMaterial();
        learningMaterialPage.clickBasicFormButton();
        basicFormPage.verifyBasicFormContent();
    }

    @Test(dependsOnMethods = "NavigateToLearningMaterials")
    public void EnterFullName() {
        basicFormPage.enterFullname("John Doe");
    }

    @Test(dependsOnMethods = "EnterFullName")
    public void EnterEmail() {
        basicFormPage.enterEmail("Example@Test.com");
    }

    @Test(dependsOnMethods = "EnterEmail")
     public void EnterAge(){
        basicFormPage.enterAge("25");
    }

    @Test(dependsOnMethods = "EnterAge")
    public void SelectGender() {

        basicFormPage.selectGender();
    }

    @Test(dependsOnMethods = "SelectGender")
    public void SelectCountry() {
        basicFormPage.selectCountry();
    }

    @Test(dependsOnMethods = "SelectCountry")
    public void SelectExperience(){
        basicFormPage.selectExperience();
    }

    @Test(dependsOnMethods = "SelectExperience")
    public void CheckSkills(){
        basicFormPage.tickJavaSkill();
        basicFormPage.tickPythonSkill();
        basicFormPage.tickSeleniumSkill();
    }

    @Test(dependsOnMethods = "CheckSkills")
    public void EnterComments(){
        basicFormPage.writeComment("Test Automation Practice");
    }

    @Test(dependsOnMethods = "EnterComments")
    public void CheckSubscribeToNewsLetter(){
        basicFormPage.tickNewsLetterSubscribe();
    }

    @Test(dependsOnMethods = "EnterComments")
    public void CheckAcceptTermsAndConditions(){
        basicFormPage.tickTermsAndConditions();
    }

    @Test(dependsOnMethods = "CheckAcceptTermsAndConditions")
    public void ClickValidateButton(){
        basicFormPage.checkValidateButton();
    }

    @Test(dependsOnMethods = "ClickValidateButton")
    public void ClickSubmitForm(){
        basicFormPage.checkSubmitForm();
    }

    @Test(dependsOnMethods = "ClickSubmitForm")
    public void ClickSubmissionsButton(){
        basicFormPage.checkSubmissions();
    }

    @Test(dependsOnMethods = "ClickSubmissionsButton")
    public void ClickViewOnSubmission(){
        basicFormPage.checkViewSubmission();
    }



}
