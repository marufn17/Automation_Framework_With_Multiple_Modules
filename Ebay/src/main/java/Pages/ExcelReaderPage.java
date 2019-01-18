package Pages;

import Helper.ExcelReader;
import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExcelReaderPage extends CommonAPI {
    public ExcelReaderPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#gh-ac")
    WebElement searchBox;

    public void searchFromExcel() throws InterruptedException {
        ExcelReader excelReader = new ExcelReader("C:\\Users\\soin1\\AutomationProjectPNT\\AutomationP1\\Ebay\\src\\main\\java\\ExcelDataFile\\xlsx\\TestData.xlsx");
        int rowcount = excelReader.getRowCount(0);
        searchBox.click();
        for (int i = 0; i < rowcount; i++) {
            String searchItems = excelReader.getData(0, i, 0);
            searchBox.sendKeys(searchItems, Keys.ENTER);
            searchBox.clear();
            Thread.sleep(500);
        }
    }

}
