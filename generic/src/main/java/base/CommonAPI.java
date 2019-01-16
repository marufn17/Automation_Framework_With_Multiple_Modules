package base;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.LogStatus;
import org.apache.maven.surefire.shade.org.apache.commons.lang3.StringUtils;
import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.Optional;
import report.ExtentManager;
import report.ExtentTestManager;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CommonAPI {
    public static WebDriver driver;
    public String browserstack_username= "marufahmad1";
    public String browserstack_accesskey = "Szcs3Fsvw8bbmg6C3yfb";
    public String saucelabs_username = "pntjan2019";
    public String saucelabs_accesskey = "0E292D17EF2648C89C0D6BC4D3502195";
    public static ExtentReports extent;//ExtentReport

    public CommonAPI(){}
    @BeforeSuite
    public void extentSetup(ITestContext context) {
        ExtentManager.setOutputDirectory(context);
        extent = ExtentManager.getInstance();
    }
    @BeforeMethod
    public void startExtent(Method method) {
        String className = method.getDeclaringClass().getSimpleName();
        String methodName = method.getName().toLowerCase();
        ExtentTestManager.startTest(method.getName());
        ExtentTestManager.getTest().assignCategory(className);
    }
    //Selenium API start
//    @Parameters({"useCloudEnv","cloudEnvName","os","os_version","browserName","browserVersion","url"})
//    @BeforeMethod
//    public void setUp(@Optional("false") boolean useCloudEnv, @Optional("false")String cloudEnvName,
//                      @Optional("OS X") String os, @Optional("10") String os_version, @Optional("chrome") String browserName, @Optional("34")
//                              String browserVersion, @Optional("http://www.nbc.com") String url)throws IOException {
//        System.setProperty("webdriver.chrome.driver", "/Users/maruf/AllJavaProject/AutomationP1/generic/Drivers/Mac/chromedriver");
//        if(useCloudEnv==true){
//            if(cloudEnvName.equalsIgnoreCase("browserstack")) {
//                getCloudDriver(cloudEnvName,browserstack_username,browserstack_accesskey,os,os_version, browserName, browserVersion);
//            }else if (cloudEnvName.equalsIgnoreCase("saucelabs")){
//                getCloudDriver(cloudEnvName,saucelabs_username, saucelabs_accesskey,os,os_version, browserName, browserVersion);
//            }
//        }else{
//            getDriverFromSystem(browserName);
//        }
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
//        //driver.manage().window().fullscreen();
//        driver.get(url);
//    }
    @Parameters({"url","browser"})
    @BeforeMethod
    public void setUp(@Optional("https://www.ebay.com") String url, @Optional("chrome") String browser){
        getDriverFromSystem(browser);
        driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
        driver.manage ().window ().fullscreen ();
        driver.get(url);
    }
    @AfterMethod
    public void afterEachTestMethod(ITestResult result) {
        ExtentTestManager.getTest().getTest().setStartedTime(getTime(result.getStartMillis()));
        ExtentTestManager.getTest().getTest().setEndedTime(getTime(result.getEndMillis()));
        for (String group : result.getMethod().getGroups()) {
            ExtentTestManager.getTest().assignCategory(group);}
        if (result.getStatus() == 1) {
            ExtentTestManager.getTest().log(LogStatus.PASS, "Test Passed");
        } else if (result.getStatus() == 2) {
            ExtentTestManager.getTest().log(LogStatus.FAIL, getStackTrace(result.getThrowable()));
        } else if (result.getStatus() == 3) {
            ExtentTestManager.getTest().log(LogStatus.SKIP, "Test Skipped");
        }
        ExtentTestManager.endTest();
        extent.flush();
        if (result.getStatus() == ITestResult.FAILURE) {
            captureScreenshot(driver, result.getName());
        }
        driver.quit();
    }
    @AfterSuite
    public void generateReport() {
        extent.close();
    }
    private Date getTime(long millis) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(millis);
        return calendar.getTime();
    }

    public static void getDriverFromSystem(String browserName){
        String getOsNameFromSystem = System.getProperty("os.name");
        if(getOsNameFromSystem.contains("Mac")){
            if (browserName.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver","../generic/Drivers/Mac/chromedriver");
                driver = new ChromeDriver();
            }else if(browserName.equalsIgnoreCase("Firefox")){
                System.setProperty("webdriver.gecko.driver", "../generic/Drivers/Mac/geckodriver");
                driver = new FirefoxDriver();
            }
        }else if (getOsNameFromSystem.contains("Windows")){
            if(browserName.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver","..\\Generic\\Drivers\\Windows\\chromedriver.exe");
                driver = new ChromeDriver();
            }else if (browserName.equalsIgnoreCase("Firefox")){
                System.setProperty("webdriver.gecko.driver", "..\\Generic\\Drivers\\Windows\\geckodriver.exe");
                driver = new FirefoxDriver();
            }
        }
    }
    public static void captureScreenshot(WebDriver driver, String screenshotName){
        DateFormat df = new SimpleDateFormat("(MM.dd.yyyy-HH:mma)");
        Date date = new Date();
        df.format(date);
        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File(System.getProperty("user.dir")+ "/screenshots/"+screenshotName+" "+df.format(date)+".png"));
            System.out.println("Screenshot captured");
        } catch (Exception e) {
            System.out.println("Exception while taking screenshot "+e.getMessage());;
        }
    }
    public static String convertToString(String st){
        String splitString ;
        splitString = StringUtils.join(StringUtils.splitByCharacterTypeCamelCase(st), ' ');
        return splitString;
    }
    protected String getStackTrace(Throwable t) {
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        t.printStackTrace(pw);
        return sw.toString();
    }

    public WebDriver getCloudDriver(String envName,String envUsername, String envAccessKey,String os, String os_version,String browserName,
                                    String browserVersion)throws IOException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("browser",browserName);
        cap.setCapability("browser_version",browserVersion);
        cap.setCapability("os", os);
        cap.setCapability("os_version", os_version);
        if(envName.equalsIgnoreCase("Saucelabs")){
            //resolution for Saucelabs
            driver = new RemoteWebDriver(new URL("http://"+envUsername+":"+envAccessKey+
                    "@ondemand.saucelabs.com:80/wd/hub"), cap);
        }else if(envName.equalsIgnoreCase("Browserstack")) {
            cap.setCapability("resolution", "1024x768");
            driver = new RemoteWebDriver(new URL("http://" + envUsername + ":" + envAccessKey +
                    "@hub-cloud.browserstack.com/wd/hub"), cap);
        }
        return driver;
    }

    public WebDriver getDriverIncognito(String os, String browserName){
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
                System.setProperty("webdriver.chrome.driver","..\\Generic\\Drivers\\Windows\\chromedriver.exe");
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
                System.setProperty("webdriver.gecko.driver","..\\Generic\\Drivers\\Windows\\geckodriver.exe");
                driver = new FirefoxDriver(options);
            }
        }
        return driver;
    }
    public static void getDriver(String os, String browser) {
        if (os.contains("mac")) {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "../generic/Drivers/Mac/chromedriver");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", "../generic/Drivers/Mac/geckodriver");
                driver = new FirefoxDriver();}
        } else if (os.contains("windows")) {
            if (browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "..\\Generic\\Drivers\\Windows\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("Firefox")) {
                System.setProperty("webdriver.gecko.driver", "..\\Generic\\Drivers\\Windows\\geckodriver.exe");
                driver = new FirefoxDriver();}
        }
    }
    public static void typeOnWebElement(WebElement webElement, String value){webElement.sendKeys(value);}
    public static void clickOnWebElement(WebElement webElement){webElement.click();}
}