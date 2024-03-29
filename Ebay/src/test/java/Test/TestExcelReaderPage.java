package Test;

import Pages.ExcelReaderPage;
import base.CommonAPI;
import com.relevantcodes.extentreports.ExtentReports;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import report.ExtentManager;

public class TestExcelReaderPage extends CommonAPI {
    ExcelReaderPage excelReaderPage;
    ExtentReports reports;

    @BeforeMethod
    public void setUp() {
        this.excelReaderPage = new ExcelReaderPage();
        reports = ExtentManager.getInstance();
    }

    @Test(priority = 1)
    public void itemsSearchFromExcelData() throws InterruptedException {
        excelReaderPage.searchFromExcel();
    }
}
