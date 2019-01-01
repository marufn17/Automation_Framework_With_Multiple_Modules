package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public static WebDriver driver = null;

    @BeforeMethod
    public void setUp(@Optional("mac") String os, @Optional("chrome") String browser){
        getDriver(os, browser);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);}
    @AfterMethod
    public void closeDriver(){driver.close();}

    public WebDriver getDriver(String os, String browserName) {
        if (os.equalsIgnoreCase("mac")) {
            if (browserName.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/Drivers/Mac/chromedriver");
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/Drivers/Mac/geckodriver");
                driver = new FirefoxDriver();
            }
        } else if (os.equalsIgnoreCase("windows")) {
            if (browserName.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "../Generic/Drivers/Windows/chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browserName.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver", "../Generic/Drivers/Windows/geckodriver.exe");
            }
        }
        return driver;
    }
}
