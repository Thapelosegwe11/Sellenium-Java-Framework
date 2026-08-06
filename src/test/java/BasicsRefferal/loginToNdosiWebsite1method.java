package BasicsRefferal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class loginToNdosiWebsite1method {

    WebDriver driver;


    @Test
    public void loginToNdosiWebsiteTest() throws InterruptedException{
        driver = new ChromeDriver();
        Thread.sleep(2000);
        driver.get("https://ndosisimplifiedautomation.vercel.app/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/button/span[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("login-email")).sendKeys("segwe.bz@gmail.com");
        driver.findElement(By.id("login-password")).sendKeys("rA!ny@$14");
        Thread.sleep(2000);
        driver.findElement(By.id("login-submit")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"app-root\"]/nav/div[1]/div[3]/div/button/span[1]")).isDisplayed();


        driver.quit();

    }
}
