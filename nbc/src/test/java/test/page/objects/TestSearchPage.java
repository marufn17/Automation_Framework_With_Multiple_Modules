package test.page.objects;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.SearchPage;

import java.util.List;

public class TestSearchPage extends CommonAPI {
    SearchPage searchPage;
    HomePage homePage;
    @BeforeMethod
    public void setUp(){
        searchPage = PageFactory.initElements(driver,SearchPage.class);
        homePage = PageFactory.initElements(driver,HomePage.class);
    }
    @Test
    public void searchShowsTest() throws Exception {
        homePage.clickOnSearch();
        List actual = searchPage.searchResult();
        List expected = searchPage.expectedSearchResult();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void negativeSearch(){
        homePage.clickOnSearch();
        String actual = searchPage.searchErrorMessage();
         String expected = searchPage.expectedErrorMessage();
         Assert.assertEquals(actual,expected);
    }

}
