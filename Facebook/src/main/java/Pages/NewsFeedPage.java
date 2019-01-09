package Pages;

import HelperClasses.SimpleXlReader;
import HelperClasses.Xls_Reader;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewsFeedPage extends CommonAPI {
    public NewsFeedPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "._1frb")
    WebElement searchbox;

    //Actions/Methods
    //Search Using data from xlsx file
    Xls_Reader xlreader = new Xls_Reader("/Users/mohammedmehadi/Desktop/TheGroupeFramework/AutomationP1/Facebook/DataProvider/FacebookSearch.xlsx");
    public void xltoSearchBar () throws InterruptedException {
        int rowcount = xlreader.getRowCount("Cars");
        for (int rowNum = 2;rowNum <= rowcount;rowNum++){
            String searchItems =xlreader.getCellData("Cars","SearchItems",rowNum);
            searchbox.sendKeys(searchItems, Keys.ENTER);
            searchbox.clear();
            Thread.sleep(1000);

    }
    }
    public void xltoSearchbar2() throws InterruptedException {
        SimpleXlReader simmplexlreader = new SimpleXlReader("/Users/mohammedmehadi/Desktop/TheGroupeFramework/AutomationP1/Facebook/DataProvider/FacebookSearch.xlsx");
        int rowcount = simmplexlreader.getRowCount(0);
        for (int i = 0;i<rowcount; i++){
            String searchItems = simmplexlreader.getData(0,i,0);
            searchbox.sendKeys(searchItems,Keys.ENTER);
            searchbox.clear();
            Thread.sleep(2000);
        }

    }
}
