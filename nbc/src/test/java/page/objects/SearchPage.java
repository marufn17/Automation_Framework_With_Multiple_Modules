package page.objects;

import application.page.base.ApplicationPageBase;
import application.page.base.ConnectToSqlDB;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import report.TestLogger;
import java.util.ArrayList;
import java.util.List;

public class SearchPage extends ApplicationPageBase {
    ConnectToSqlDB connect = new ConnectToSqlDB ();
    @FindBy(xpath = "//input[@class='search-input__input']")
    WebElement searchField;
    @FindBy(xpath = "//main[@id='main']/div[1]/div/div/div/div/div[2]/div/section/div/div")
    WebElement searchResult;
    @FindBy(xpath = "//div[@class='search__results__no_results']")
    WebElement error;

    public List<String> searchResult() throws Exception {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
    public String searchErrorMessage(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchField.sendKeys("wwf");
        String text = error.getText();
        return text;
    }
    public String expectedErrorMessage(){
        String text = "Sorry, there are no results for \"wwf\".\n" +
                "You can search for shows or episodes.\n" +
                "Do you want to check out our popular shows?";
        return text;
    }
}
