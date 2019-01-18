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

    @FindBy(xpath = "//*[@id=\\\"gf-BIG\\\"]/table/tbody/tr/td[3]/ul/li[6]/a\"")
    WebElement eBayBlog;

    public String eBayBlogIcon() throws InterruptedException {

        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        eBayBlog.click();
        Thread.sleep(2500);
        System.out.println(driver.getTitle());

        for (String ebayblog : driver.getWindowHandles()) {
            driver.switchTo().window(ebayblog);
        }
        System.out.println(driver.getTitle());
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }

    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[4]/ul/li[1]/h3/a")
    WebElement abouteBay;

    public String abouteBayIcon() throws InterruptedException {

        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        abouteBay.click();
        Thread.sleep(3500);
        System.out.println(driver.getTitle());

        for (String aboutebay : driver.getWindowHandles()) {
            driver.switchTo().window(aboutebay);
        }
        System.out.println(driver.getTitle());
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
}