package TestRunners;

import Utils.Base;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginFlowTests extends Base {

    @Test(priority = 1)
    public void verifyHomeContentTest(){
        homepage.verifyHomeScreenContent();
        homepage.clickMainLoginButton();
    }

    @Test(priority = 2)
    public void loginFlowTest(){
       loginFormPage.enterUsername("segwe.bz@gmail.com");
       loginFormPage.enterPassword("rA!ny@$14");
       loginFormPage.clickSubmit();
    }

    @Test(priority = 3)
    public void verifyLandingPage(){
        dashboardPage.verifyHomeContent();
    }


}

