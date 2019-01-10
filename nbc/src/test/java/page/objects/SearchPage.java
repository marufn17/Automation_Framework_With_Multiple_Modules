package page.objects;

import application.page.base.ConnectToSqlDB;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends CommonAPI {
    ConnectToSqlDB connect = new ConnectToSqlDB ();
    @FindBy(xpath = "//input[@class='search-input__input']")
    WebElement searchField;
    @FindBy(xpath = "//main[@id=\'main\']/div[1]/div/div/div/div/div[2]/div/section/div/div")
    WebElement searchResult;

    public List<String> searchResult() throws Exception {
        List<String> data = connect.readDataBase("searchItem","itemName");
        List<String> list = new ArrayList<>();
        for (String st:data){
            searchField.sendKeys(st);
            Thread.sleep(1000);
            list.add(searchResult.getText());
            System.out.println(searchResult.getText());
            searchField.clear();
        }
        return list;
    }
    public List<String > expectedSearchResult(){
        List<String> list = new ArrayList<>();
        list.add("WE FOUND 33 RELATED RESULTS");
        list.add("WE FOUND 33 RELATED RESULTS");
        list.add("WE FOUND 219 RELATED RESULTS");
        list.add("WE FOUND 11 RELATED RESULTS");
        list.add("WE FOUND 39 RELATED RESULTS");
        list.add("WE FOUND 60 RELATED RESULTS");
        list.add("WE FOUND 86 RELATED RESULTS");
        list.add("WE FOUND 27 RELATED RESULTS");
        list.add("WE FOUND 21 RELATED RESULTS");
        list.add("WE FOUND 2269 RELATED RESULTS");
        return list;
    }
}
