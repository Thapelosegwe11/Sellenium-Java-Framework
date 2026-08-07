package TestRunners;

import Utils.Base;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BasicFormTests extends Base {



    @Test
    public void NavigateToLearningMaterials() {
        dashboardPage.clickLearnDropdownButton();
        dashboardPage.clickLearningMaterial();
        learningMaterialPage.clickBasicFormButton();
    }

    @Test(priority = 1)
    public void EnterDetails(){
        basicFormPage.enterFullname("John Doe");
        basicFormPage.enterEmail("Example@Test.com");
        basicFormPage.enterAge("25");
    }

    @Test(priority = 2)
    public void SelectDropdowns(){
        basicFormPage.selectGender();
        basicFormPage.selectCountry();
        basicFormPage.selectExperience();
    }

    @Test(priority = 3)
    public void CheckSkillBoxes(){
        basicFormPage.tickJavaSkill();
        basicFormPage.tickPythonSkill();
        basicFormPage.tickSeleniumSkill();
    }

}
