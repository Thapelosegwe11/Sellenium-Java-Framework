package TestRunners;

import TestData.readFromDataBase;
import Utils.Base;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginFlowTests extends Base {

    @BeforeClass
    public void setup(){
         readFromDataBase.dbConnector();
    }

    @Test
    public void verifyHomeContentTest(){
        homepage.verifyHomeScreenContent();
        homepage.clickMainLoginButton();
    }

    @Test(dependsOnMethods = "verifyHomeContentTest")
    public void loginFlowTest(){
       loginFormPage.loginToWebsite(readFromDataBase.getUsername, readFromDataBase.getPassword);
    }

    @Test(dependsOnMethods = "loginFlowTest")
    public void verifyLandingPage(){
        dashboardPage.verifyHomeContent();
    }


}

