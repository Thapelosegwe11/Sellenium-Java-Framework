package TestCases;

import TestData.readFromDataBase;
import Utils.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;


public class EditProfileTests extends Base {


//   @BeforeClass
//   public void fetchData(){
//       LoginFlowTests.setup();
//   }

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

       @Test
    public void uploadProfilePic(String filePath){
       myProfilePage.clickChoosePhoto();
       driver.findElement(By.xpath("//input[@id='profilePicture']")).sendKeys(filePath
       );
        }
   }

