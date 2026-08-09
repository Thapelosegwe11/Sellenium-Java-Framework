package Utils;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class BrowserFactory {

    public static WebDriver driver;

    public static WebDriver launchBrowser(String browserChoice, String url){

        if (browserChoice.equalsIgnoreCase("cHroMe")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            //Headless for git pipeline switch On when I want to run in pipeline turn off for local testing purposes.
            options.addArguments("--headless=new");
            driver = new ChromeDriver(options);

        }else if (browserChoice.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();

        }else if (browserChoice.equalsIgnoreCase("Safari")){
            driver = new SafariDriver();

        }else {
            driver = new EdgeDriver();
        }

   //     driver.manage().window().maximize(); // for testing purpose locally

  //      Dimensions for locator during headless run in pipeline turn on when I want to run in pipeline.
        driver.manage().window().setSize(new Dimension(1920,1080));

        driver.get(url);

  //    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;
    }

}
