package TestCases;

import TestData.readFromDataBase;
import Utils.Base;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class EditProfileTests extends Base {


   @BeforeClass
   public void fetchData(){
       LoginFlowTests.setup();
   }

   @Test
    public void loginViaUser() {

       homepage.verifyHomeScreenContent();
       homepage.clickMainLoginButton();
       loginFormPage.loginToWebsite(readFromDataBase.studentUsername,readFromDataBase.studentPassword);

   }

   @Test(dependsOnMethods = "loginViaUser")
    public void navigateToProfile() {

       dashboardPage.clickMenuButton();
       dashboardPage.clickOnMyProfile();
       myProfilePage.clickEditProfile();
       }

       @Test(dependsOnMethods = "navigateToProfile")
    public void uploadProfilePic() {
       String filePath = getClass().getClassLoader().getResource("TheGoat.jpeg").getPath();
       myProfilePage.uploadProfilePic(filePath);
        }
   }

