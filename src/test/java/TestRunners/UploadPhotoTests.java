package TestRunners;

import TestData.readFromDataBase;
import Utils.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UploadPhotoTests extends Base {

   @Test
    public void loginFirstUser() {
       homepage.clickMainLoginButton();
       loginFormPage.loginToWebsite(readFromDataBase.getUsername,readFromDataBase.getPassword);

   }

   @Test
    public void navigateToProfile() {
       dashboardPage.clickMenuButton();
       dashboardPage.clickOnMyProfile();
       myProfilePage.clickEditProfile();
       }

       @Test
    public void uploadProfilePic(String filePath){
       driver.findElement(By.xpath("//input[@id='profilePicture']")).sendKeys(filePath);
        }
   }

