package Test;


import Pages.FashionPage;
import Pages.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFashionPage extends CommonAPI {
    FashionPage fashionPage;
    HomePage homePage;

    @BeforeMethod
    public void setFashionPage() {
        fashionPage = PageFactory.initElements(driver,FashionPage.class);
        homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.fashiontab();

    }
    @Test(priority = 1)
    public void clickOnHealthtab() {
        fashionPage.healthtab();

    }
}
