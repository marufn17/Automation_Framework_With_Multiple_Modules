package Pages;

import HelperClasses.ConnectToSqlDb;
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
import java.util.ArrayList;
import java.util.List;

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
    @FindBy(css = "a[class=' _666h  _18vj _18vk _42ft']")
            WebElement comment;
    @FindBy(css = "a[class=' _6a-y _3l2t  _18vj']")
            WebElement Like;


    //=====>Actions/Methods<=======
    //Search Using data from MySql database
    List<String> glist = new ArrayList<String>();
    List<String> actual=new ArrayList<>();
    public List<String> Expected(){
        glist.add("Selenium Automation");
        glist.add("Mobile Testing");
        glist.add("Selenium Appium");
        glist.add("Desktop App Automation");
    return glist;
    }
    ConnectToSqlDb connect = new ConnectToSqlDb();
    public List<String> searchfromdatabase() throws Exception {
        Expected();
        connect.createTableFromStringToMySql("Searchitems","ItemsList");
        connect.insertDataFromArrayListToSqlTable(glist,"Searchitems","ItemsList");
        List<String> data = connect.readDataBase("Searchitems","ItemsList");
        for (String items:data){
            searchbox.sendKeys(items, Keys.ENTER);
            Thread.sleep(1000);
            searchbox.clear();
            actual.add(items);
        }
        return actual;
    }

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
        Thread.sleep(1000);
        String currenturl = driver.getCurrentUrl();
        return currenturl;
    }

    //Click on messenger
    public String gotoMessenger() throws InterruptedException {
        actions.click(messenger).build().perform();
        Thread.sleep(1000);
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
    public void photoupload() throws InterruptedException, AWTException {
        driver.manage().window().setPosition(new org.openqa.selenium.Point(100, 50));
        actions.click(photouploadbutton).build().perform();
        actions.click(photouploadbutton).build().perform();
        Thread.sleep(1000);
        StringSelection stringSelection= new StringSelection(imgfile.getAbsolutePath());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
        Robot robot = new Robot();


        robot.keyPress(KeyEvent.VK_META);

        robot.keyPress(KeyEvent.VK_TAB);

        robot.keyRelease(KeyEvent.VK_META);

        robot.keyRelease(KeyEvent.VK_TAB);


        robot.delay(500);

        robot.keyPress(KeyEvent.VK_META);

        robot.keyPress(KeyEvent.VK_SHIFT);

        robot.keyPress(KeyEvent.VK_G);

        robot.keyRelease(KeyEvent.VK_META);

        robot.keyRelease(KeyEvent.VK_SHIFT);

        robot.keyRelease(KeyEvent.VK_G);
        robot.delay(500);

        robot.keyPress(KeyEvent.VK_META);

        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_META);

        robot.keyRelease(KeyEvent.VK_V);
        robot.delay(500);

        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.delay(500);

        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(5000);
        postButton.click();

    }

    //Comment
    public void commentOnPost() throws InterruptedException {
        actions.click(comment).build().perform();
        actions.click(comment).build().perform();
        actions.sendKeys("This is the comment").build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
        Thread.sleep(1000);
    }
    //like
    public void likeonpost() throws InterruptedException {
        actions.moveToElement(Like).click().build().perform();
        actions.moveToElement(Like).click().build().perform();
        Thread.sleep(2000);
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
