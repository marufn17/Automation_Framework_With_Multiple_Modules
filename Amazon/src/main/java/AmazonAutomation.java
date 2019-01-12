import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class AmazonAutomation {
    public static WebDriver driver = null;

    @BeforeMethod
    public void seUP(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com");

    }

    @AfterMethod
    public void cleanUp(){
        driver.close();
    }
}



