package Pages;

import Helper.ConnectToSqlDb;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class SqlDataPage extends CommonAPI {
    public SqlDataPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(id = "gh-ac")
    WebElement searchBox;
    ConnectToSqlDb connectToSqlDb = new ConnectToSqlDb();
    public void setSearchBoxSqlDB() throws Exception {
        List<String> list = new ArrayList<String>();
        list.add("iphone");
        list.add("toy");
        list.add("java book");
        list.add("Shoes");
        connectToSqlDb.insertDataFromArrayListToSqlTable(list, "ItemTable", "ItemName");
        searchBox.click();
        List<String> list1 = connectToSqlDb.readDataBase("ItemTable", "ItemName");
        for (String items : list1) {
            searchBox.sendKeys(items, Keys.ENTER);
            searchBox.clear();
        }
        }
}
