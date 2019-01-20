package Test;

import Pages.SqlDataPage;
import base.CommonAPI;
import com.relevantcodes.extentreports.ExtentReports;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import report.ExtentManager;


public class TestSqlDataPage extends CommonAPI {
    SqlDataPage sqlDataPage;
    ExtentReports reports;

    @BeforeMethod
    public void setUp() {
        this.sqlDataPage = new SqlDataPage();
        reports = ExtentManager.getInstance();
    }

    @Test(priority = 1)
    public void itemsSearchFromSqlDataBase() throws Exception {
        sqlDataPage.setSearchBoxSqlDB();
    }
}
