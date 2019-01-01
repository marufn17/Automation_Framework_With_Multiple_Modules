package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
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

    public WebDriver getDriver(String os, String browserName){
        if(browserName.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--incognito");
            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            capabilities.setCapability(ChromeOptions.CAPABILITY, options);
            if(os.equalsIgnoreCase("mac")){
                System.setProperty("webdriver.chrome.driver","../Generic/Drivers/Mac/chromedriver");
                driver = new ChromeDriver(options);}
            else if(os.equalsIgnoreCase("windows")){
                System.setProperty("webdriver.chrome.driver","../Generic/Drivers/Windows/chromedriver.exe");
                driver = new ChromeDriver(options);}
        }else if (browserName.equalsIgnoreCase("firefox")){
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--start-maximized");
            options.addArguments("--ignore-certificate-errors");
            options.addArguments("--private");
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options);
            if (os.equalsIgnoreCase("mac")){
                System.setProperty("webdriver.chrome.driver","../Generic/Drivers/Mac/geckodriver");
                driver = new FirefoxDriver(options);
            }else if (os.equalsIgnoreCase("windows")){
                System.setProperty("webdriver.gecko.driver","../Generic/Drivers/Windows/geckodriver.exe");
                driver = new FirefoxDriver(options);
            }
        }
        return driver;
    }
}
