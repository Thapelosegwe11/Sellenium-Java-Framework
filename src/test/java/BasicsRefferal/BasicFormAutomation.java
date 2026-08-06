package BasicsRefferal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BasicFormAutomation {

    WebDriver driver;

    @BeforeTest

    public void setup() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        Thread.sleep(5000);


    }

    @Test

    public void clickLogin() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
        Thread.sleep(3000);
    }

    @Test(priority = 1)
    public void enterEmail() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.id("login-email")).sendKeys("segwe.bz@gmail.com");
    }

    @Test(priority = 2)
    public void enterPassword() throws InterruptedException {
        driver.findElement(By.id("login-password")).sendKeys("rA!ny@$14");
    }


    @Test(priority = 3)
    public void clickSubmit() {
        driver.findElement(By.id("login-submit")).click();
    }

    @Test(priority = 4)
    public void verifyLogin() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button/span[1]")).isDisplayed();
    }

    @Test(priority = 5)
    public void clickLearnDropdown() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")).click();
        Thread.sleep(3000);
    }

    @Test(priority = 6)
    public void clickLearningMaterial() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")).click();
        Thread.sleep(3000);
    }
//////////////
    @Test(priority = 7)
    public void moveToBasicForm() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"tab-btn-password\"]/span[2]")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 8)
    public void enterFullName() throws InterruptedException {
        driver.findElement(By.id("name")).sendKeys("John Doe");
        Thread.sleep(3000);
    }

    @Test(priority = 9)
    public void enterEmailAddress() throws InterruptedException {
        driver.findElement(By.id("email")).sendKeys("john@test.com");
        Thread.sleep(3000);
    }

    @Test(priority = 10)
    public void enterAge() throws InterruptedException {
        driver.findElement(By.id("age")).sendKeys("25");
        Thread.sleep(3000);
    }

    @Test(priority = 11)
    public void selectGender() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"gender\"]/option[2]")).click();
        Thread.sleep(3000);
    }

    @Test(priority = 12)
    public void selectCountry() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"country\"]/option[5]")).click();
        Thread.sleep(3000);
    }

    @Test(priority = 13)
    public void selectExperience() throws InterruptedException {
        driver.findElement(By.xpath("//*[@id=\"experience\"]/option[3]")).click();
        Thread.sleep(3000);
    }

    @Test(priority = 14)
    public void checkSkillJavaScript() throws InterruptedException {
        driver.findElement(By.id("skill-javascript")).click();
        Thread.sleep(3000);
    }

    @Test(priority = 15)
    public void checkSkillSelenium() {

        driver.findElement(By.id("skill-selenium")).click();
    }

    @Test(priority = 16)
    public void checkNewsLetter(){

        driver.findElement(By.id("terms")).click();
    }

    @Test(priority = 17)
    public void checkTermsConditions() {

        driver.findElement(By.id("skill-selenium")).click();
    }

    @Test(priority = 18)
    public void clickValidate() throws InterruptedException {
        driver.findElement(By.id("validate-btn")).click();
        Thread.sleep(5000);
    }

    @Test(priority = 19)
    public void clickSubmitForm() throws InterruptedException {
        driver.findElement(By.id("submit-btn")).click();
        Thread.sleep(3000);
    }


    @Test(priority = 20)
    public void clickSubmissionsButton() throws InterruptedException {
        driver.findElement(By.id("submissions-toggle-btn")).click();
        Thread.sleep(3000);
    }

    @Test(priority = 21)
    public void clickViewSubmissionButton() throws InterruptedException {
        driver.findElement(By.id("view-submission-0")).click();
        Thread.sleep(5000);
    }


    @AfterTest
    public void tearDown() {
        driver.quit();
    }

}
