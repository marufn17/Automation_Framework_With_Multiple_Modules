package application.page.base;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import report.TestLogger;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ApplicationPageBase extends CommonAPI {
    public static void sendKeys(WebElement webElement, String elementName, String keys){
        webElement.clear();
        TestLogger.log("Send keys to "+ elementName);
        webElement.sendKeys(keys);
        TestLogger.log("Keys sent to " + elementName);
    }
    public static String getText(WebElement webElement, String webElementName){
        TestLogger.log("getting Text from " + webElementName);
        String actualText = webElement.getText();
        TestLogger.log("Actual text : " + webElementName);
        return actualText;
    }
    public static Properties loadProperties() throws IOException {
        Properties prop = new Properties();
        File filepath = new File(System.getProperty("user.dir") +  "/src/test/resources/secret.properties");
        InputStream ism = new FileInputStream(filepath.getAbsoluteFile());
        prop.load(ism);
        ism.close();
        return prop;
    }
}
