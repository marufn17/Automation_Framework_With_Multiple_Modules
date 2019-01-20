package Test;

import Pages.HomePage;
import base.CommonAPI;
import com.relevantcodes.extentreports.ExtentReports;
import org.testng.Assert;
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
        String actual = homePage.searchbox();
        String expected = "Becoming by Michelle Obama (New Hardcover Book – 2018)";
        Assert.assertEquals(actual, expected);
    }

    @Test(priority = 1)
    public void searchitem() {
        String actual = homePage.setSearchItem();
        String expected = "New Kids Children TABLET PAD Educational Learning Toys Gift For Boys Girls Baby";
        Assert.assertEquals(actual, expected);
    }

    @Test(priority = 3)
    public void createacctpage() {
        String actual = homePage.createaccttab();
        String expected = "Already a member?";
        Assert.assertEquals(actual, expected);
    }

    @Test(priority = 4)
    public void motortab() {
        String actual = homePage.setSearchMotortab();
        String expected = "eBay Motors";
        Assert.assertEquals(actual, expected);
    }

    @Test(priority = 5)
    public void dailydealstab() {
        homePage.dailydealstab();
    }

    @Test(priority = 6)
    public void fashiontabbutton() {
        String actual = homePage.fashiontab();
        String expected = "Your Routine, Revitalized";
        Assert.assertEquals(actual, expected);
    }

    @Test(priority = 7)
    public void electronicstab() {
        String actual = homePage.electronic();
        String expected = "Electronics";
        Assert.assertEquals(actual, expected);
    }

    @Test(priority = 8)
    public void collectiblesarttab() {
        String actual =  homePage.collectibles();
        String expected = "Shop by Category";
        Assert.assertEquals(actual,expected);
    }

    @Test(priority = 9)
    public void homeandgardentab() {
        String actual = homePage.homegardentab();
        String expected = "Home & Garden";
        Assert.assertEquals(actual,expected);
    }

    @Test(priority = 10)
    public void sportinggoods() {
        homePage.sportinggoodsTest();
    }

    @Test(priority = 11)
    public void toysearch() {
        homePage.toytab();
    }

    @Test(priority = 12)
    public void morepage() {
        homePage.moresearch();
    }

    @Test(priority = 13)
    public void giftcardspage() {
        homePage.giftcardsearch();
    }

    @Test(priority = 14)
    public void helpcotactpage() {
        homePage.helpcontactsearch();
    }

    @Test(priority = 15)
    public void sellpage() {
        homePage.sellSearch();
    }

    @Test(priority = 16)
    public void myebaypage() {
        homePage.myebaytab();
    }

    @Test(priority = 17)
    public void shoppingcartpage() {
        homePage.shoppingcartsearch();
    }

    @Test(priority = 18)
    public void businesspage() {
        homePage.businesssearch();
    }

    @Test(priority = 19)
    public void shopcategorypage() {
        homePage.shopbycategorysearch();
    }

    @Test(priority = 20)
    public void allcategorypage() {
        homePage.allcategorysearch();
    }

    @Test(priority = 21)
    public void advancetab() {
        homePage.advancesearch();
    }

    @Test(priority = 22)
    public void bellbuttontab() {
        homePage.bellbuttonsearch();
    }

    @Test(priority = 23)
    public void buybutton() {
        homePage.buysearch();
    }

    @Test(priority = 23)
    public void sellbutton() {
        homePage.sellSearch();
    }

    @Test(priority = 24)
    public void communitypage() {
        homePage.communitysearch();
    }

    @Test(priority = 25)
    public void useragreementtab() throws InterruptedException {
        homePage.useragreementsearch();
        Thread.sleep(2000);
    }

    @Test(priority = 26)
    public void hompagelogotab() throws InterruptedException {
        boolean logo = HomePage.homepagelogotest();
        Assert.assertEquals(logo, true);
    }

    @Test(priority = 27)
    public void itemssearchfromdatabase() throws Exception {
        homePage.searchfromdatabase();
    }

    @Test(priority = 28)
    public void itemsearchfromExceldata() throws InterruptedException {
        homePage.searchfromExcel();
    }

    @Test(priority = 29)
    public void signinpage() {
        homePage.setSingin();
    }
}


