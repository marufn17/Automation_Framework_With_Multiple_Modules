package Pages;

import HelperClasses.SimpleXlReader;
import HelperClasses.Xls_Reader;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.security.Key;

public class NewsFeedPage extends CommonAPI {
    Actions actions = new Actions(driver);
    public NewsFeedPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "._1frb")
    WebElement searchbox;
    @FindBy(xpath = "//div[contains(text(),'Sele Nium')]")
    WebElement profilename;
    @FindBy(xpath = "//a[@title='Messenger']//div[@class='linkWrap noCount'][contains(text(),'Messenger')]")
    WebElement messenger;
    @FindBy(name = "xhpc_message")
    WebElement postArea;
    @FindBy(xpath = "//div[@class='_1mf _1mj']")
    WebElement postframe;
    @FindBy(css = "button[data-testid='react-composer-post-button']")
    WebElement postButton;
    @FindBy(xpath = "//p[contains(text(),'Status updated and will be deleted soon')]")
    WebElement postedText;
    @FindBy(css = "a[data-testid='post_chevron_button']")
    WebElement threedotofpost;
    @FindBy (xpath = "//span[contains(text(),'Delete')]")
    WebElement delete;
    @FindBy(xpath = "//button[contains(text(),'Delete')]")
    WebElement confirmdelete;
    @FindBy(css = "._3jk")
    WebElement photouploadbutton;
    @FindBy(xpath = "//input[@id='js_1ad']")
            WebElement inputPhoto;

    //=====>Actions/Methods<=======
    //Search Using data from xlsx file
    Xls_Reader xlreader = new Xls_Reader("/Users/mohammedmehadi/Desktop/MehadiBranch/AutomationP1/Facebook/DataProvider/FacebookSearch.xlsx");

    public void xltoSearchBar() throws InterruptedException {

        int rowcount = xlreader.getRowCount("Cars");
        for (int rowNum = 2; rowNum <= rowcount; rowNum++) {
            String searchItems = xlreader.getCellData("Cars", "SearchItems", rowNum);
            searchbox.sendKeys(searchItems, Keys.ENTER);
            searchbox.clear();
            Thread.sleep(1000);
        }
    }

    public void xltoSearchbar2() throws InterruptedException {
        SimpleXlReader simmplexlreader = new SimpleXlReader("/Users/mohammedmehadi/Desktop/MehadiBranch/AutomationP1/Facebook/DataProvider/FacebookSearch.xlsx");
        int rowcount = simmplexlreader.getRowCount(0);
        for (int i = 0; i < rowcount; i++) {
            String searchItems = simmplexlreader.getData(0, i, 0);
            searchbox.sendKeys(searchItems, Keys.ENTER);
            searchbox.clear();
            Thread.sleep(500);
        }
    }

    //Click on Profile
    public String gotoprofile() throws InterruptedException {
        actions.click(profilename).build().perform();
        String currenturl = driver.getCurrentUrl();
        return currenturl;
    }

    //Click on messenger
    public String gotoMessenger() throws InterruptedException {
        actions.click(messenger).build().perform();
        String currenturl = driver.getCurrentUrl();
        return currenturl;
    }
    //Click on whats on your mind
    public boolean PostArea() throws InterruptedException {
        actions.click(postArea).click().build().perform();
        actions.click(postArea).click().build().perform();
        Thread.sleep(1000);
        return postframe.isDisplayed();
    }
    //Post Something
    public boolean PostSomething() throws InterruptedException {
        actions.click(postArea).click().build().perform();
        actions.click(postArea).click().build().perform();
        actions.sendKeys("Status updated and will be deleted soon").build().perform();
        postButton.click();
        Thread.sleep(5000);
        return postedText.isDisplayed();
    }
    //Delete post
    public void DeletePost() throws InterruptedException {
        actions.click(threedotofpost).build().perform();
        actions.click(threedotofpost).build().perform();
        Thread.sleep(2000);
        delete.click();
        Thread.sleep(2000);
        confirmdelete.click();
        Thread.sleep(3000);
    }
    //Post a Photo
    File imgfile = new File("/Users/mohammedmehadi/Desktop/1.png");
    String imgfiledir = imgfile.getAbsolutePath();
    public void photoupload() throws InterruptedException, AWTException {
        actions.click(photouploadbutton).build().perform();
        actions.click(photouploadbutton).build().perform();
    }




    //=====>Landing pages<===========
    public ProfilePage landinonprofile() {
        actions.click(profilename).build().perform();
        actions.click(profilename).build().perform();
        return new ProfilePage();

    }

    public MessengerPage landinonmessenger() {
        actions.click(messenger).build().perform();
        actions.click(messenger).build().perform();
        return new MessengerPage();
    }
}
