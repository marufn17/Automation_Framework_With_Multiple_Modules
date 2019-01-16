package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import report.TestLogger;

public class FooterPage extends HomePage {
    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[3]/ul/li[7]/a")
    WebElement facebooktab;

    public String facebookIcon() throws InterruptedException {

        //New Tab Handle
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        facebooktab.click();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());

        for (String facebook : driver.getWindowHandles()) {
            driver.switchTo().window(facebook);
        }
        System.out.println(driver.getTitle());
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[3]/ul/li[8]/a")
    WebElement twittertab;

    public String twitterIcon() throws InterruptedException {

        //New Tab Handle
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        twittertab.click();
        Thread.sleep(5000);
        System.out.println(driver.getTitle());

        for (String twitter : driver.getWindowHandles()) {
            driver.switchTo().window(twitter);
        }
        System.out.println(driver.getTitle());
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
}


