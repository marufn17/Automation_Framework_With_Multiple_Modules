package test.page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;

public class HomePageTabFunctionTest extends ApplicationPageBase {
    HomePage homePage;

    @BeforeMethod
    public void setUp(){homePage = PageFactory.initElements(driver,HomePage.class);}
    @Test
    public void clickSearch(){
        String actual = homePage.checkSearchTab();
        Assert.assertEquals(actual,"FEATURED SHOWS");
    }
    @Test
    public void clickEpisodes(){
        String actual = homePage.checkEpisodesTab();
        Assert.assertEquals(actual,"FULL EPISODES");
    }
    @Test
    public void clickSchedule(){
        String actual = homePage.checkScheduleTab();
        Assert.assertEquals(actual,"SCHEDULE");
    }
    @Test
    public void clickShop() throws InterruptedException {
        String actual = homePage.checkShopTab();
        Assert.assertEquals(actual,"https://www.nbcstore.com/?cid=nbc_global_nav_shop");
    }
    @Test
    public void clickApp(){
        String actual = homePage.checkAppTab();
        Assert.assertEquals(actual,"THE NBC APP");
    }
    @Test
    public void clickLive(){
        String actual = homePage.checkLive();
        Assert.assertEquals(actual,"LINK PROVIDER");
    }
    @Test
    public void clickNewsAndSports(){
        boolean actual = homePage.newsFrame();
        Assert.assertTrue (actual);
    }
    @Test
    public void clickShows(){
        boolean actual = homePage.showsFrame();
        Assert.assertTrue (actual);
    }
}