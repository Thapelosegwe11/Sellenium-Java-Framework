package TestRunners;

import Utils.Base;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class BasicFormTests extends Base {



    @Test
    public void NavigateToLearningMaterials(){
        dashboardPage.clickLearnDropdownButton();
        dashboardPage.clickLearningMaterial();
        learningMaterialPage.clickBasicFormButton();
    }

}
