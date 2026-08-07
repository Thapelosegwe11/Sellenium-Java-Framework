package Utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {

    public static String takeSnapShot(WebDriver driver){
        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        String SnapShotBase64 = takesScreenshot.getScreenshotAs(OutputType.BASE64);
        return SnapShotBase64;
    }
}
