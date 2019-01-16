import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class AmazonAutomation {
    public static WebDriver driver = null;
    String baseUrl;

    @BeforeMethod
    public void seUP() throws InterruptedException {
        driver = new ChromeDriver();
        baseUrl = "https://www.amazon.com/";

        //Dynamic wait
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        driver.get("https://www.amazon.com");//enter url
        Thread.sleep(500);

        driver.manage().window().maximize();//maximise window
        driver.manage().deleteAllCookies();//delete all cookies!
    }


    @AfterMethod
    public void cleanUp()
    {
        driver.close();
    }


}



