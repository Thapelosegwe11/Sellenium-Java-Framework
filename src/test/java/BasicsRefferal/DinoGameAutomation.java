package BasicsRefferal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DinoGameAutomation {
    WebDriver driver;

    // 1.Creating our setup() & teardown() methods
    @BeforeTest
    public void setup() throws InterruptedException {

        driver = new ChromeDriver(); // 2.Initialising our browserDriver
        driver.manage().window().fullscreen(); // 3.Configured our browsers screen size
        driver.get("https://www.google.com/search?q=dinogame&oq=dinogame&gs_lcrp=EgZjaHJvbWUyBggAEEUYOdIBCTMwMjFqMGoxNagCCLACAfEFKTxGC8kSrUY&sourceid=chrome&source=chrome.rb&ie=UTF-8");
        Thread.sleep(10000);
    }

    @Test
    public void pressStartSlowerButton(){
        driver.findElement(By.xpath("//*[@id=\"main-frame-error\"]/label/span")).click();
    }

    public void teardown(){
        driver.quit();
    }
}

