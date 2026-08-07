package TestRunners;

import Utils.Base;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginFlowTests extends Base {

    @Test
    public void verifyHomeContentTest(){
        homepage.verifyHomeScreenContent();
        homepage.clickMainLoginButton();
    }

    @Test(dependsOnMethods = "verifyHomeContentTest")
    public void loginFlowTest(){
       loginFormPage.loginToWebsite("Segwe.bz@gmail.com", "rA!ny@$14");
    }

    @Test(dependsOnMethods = "loginFlowTest")
    public void verifyLandingPage(){
        dashboardPage.verifyHomeContent();
    }


}

