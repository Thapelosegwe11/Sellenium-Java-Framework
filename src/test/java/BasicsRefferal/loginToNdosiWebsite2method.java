package BasicsRefferal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class loginToNdosiWebsite2method {

    WebDriver driver;


    @BeforeTest

    public void setup() throws InterruptedException{
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        Thread.sleep(5000);

    }
    @Test
    public void clickLogin(){
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
    }

    @Test(priority = 1)
    public void enterEmail() throws InterruptedException{
        Thread.sleep(5000);
        driver.findElement(By.id("login-email")).sendKeys("segwe.bz@gmail.com");
    }

    @Test(priority = 2)
    public void enterPassword() throws InterruptedException{
        driver.findElement(By.id("login-password")).sendKeys("rA!ny@$14");
    }

    @Test(priority = 3)
    public void clickSubmit(){
        driver.findElement(By.id("login-submit")).click();
    }

    @Test(priority = 4)
    public void verifyLogin() throws InterruptedException{
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button/span[1]")).isDisplayed();
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
