package Pages;

import HelperClasses.SimpleXlReader;
import HelperClasses.Xls_Reader;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsFeedPage extends CommonAPI {
    public NewsFeedPage() {
        PageFactory.initElements(driver, this);
    }

    Actions actions = new Actions(driver);
    @FindBy(css = "._1frb")
    WebElement searchbox;
    @FindBy(xpath = "//div[contains(text(),'Sele Nium')]")
    WebElement profilename;
    @FindBy(xpath = "//a[@title='Messenger']//div[@class='linkWrap noCount'][contains(text(),'Messenger')]")
    WebElement messenger;

    //Actions/Methods
    //Search Using data from xlsx file
    Xls_Reader xlreader = new Xls_Reader("/Users/mohammedmehadi/Desktop/TheGroupeFramework/AutomationP1/Facebook/DataProvider/FacebookSearch.xlsx");

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
            Thread.sleep(2000);
        }

    }

    public String gotoprofile() throws InterruptedException {
        actions.click(profilename).build().perform();
        String currenturl = driver.getCurrentUrl();
        return currenturl;
    }

    public ProfilePage landinonprofile() {
        actions.click(profilename).build().perform();
        actions.click(profilename).build().perform();
        return new ProfilePage();

    }

    public String gotoMessenger() throws InterruptedException {
        actions.click(messenger).build().perform();
        String currenturl = driver.getCurrentUrl();
        return currenturl;
    }

    public ProfilePage landinonmessenger() {
        actions.click(messenger).build().perform();
        actions.click(messenger).build().perform();
        return new ProfilePage();
    }
}
