package application.page.base;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import report.TestLogger;

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
}
