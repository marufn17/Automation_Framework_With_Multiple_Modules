package Test;

import Pages.HomePage;
import base.CommonAPI;
import com.relevantcodes.extentreports.ExtentReports;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import report.ExtentManager;

public class TestHomePage extends CommonAPI {
    HomePage homePage;
    ExtentReports reports;

    @BeforeMethod
    public void setUp() {
        this.homePage = new HomePage();
        reports = ExtentManager.getInstance();
    }
    @Test(priority = 2)
    public void searchTest() {
        homePage.searchbox();
    }

    @Test(priority = 1)
    public void searchitem() {
        homePage.setSearchItem();
    }
    @Test(priority = 3)
    public void signinpage() {
        homePage.createacct();
    }
    @Test(priority = 4)
    public void motortab() {
        homePage.motortab();
    }
    @Test(priority = 5)
    public void dailydealstab() {
        homePage.dailydealstab();
    }
    @Test(priority = 6)
    public void fashiontab() {
        homePage.fashiontab();
    }
    @Test(priority = 7)
    public void electronicstab() {
        homePage.electronicstab();
    }
    @Test(priority = 8)
    public void collectiblesarttab(){
        homePage.collectiblesarttab();
    }
    @Test(priority = 9)
    public void homeandgardentab(){
        homePage.homegardentab();
    }
    @Test(priority = 10)
    public void sportinggoods(){
        homePage.sportinggoodsTest();
    }
    @Test(priority = 11)
    public void toysearch(){
        homePage.toytab();
    }
    @Test(priority = 12)
    public void morepage(){
        homePage.moresearch();
    }
}

