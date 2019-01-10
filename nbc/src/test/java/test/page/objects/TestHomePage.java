package test.page.objects;

import application.page.base.ApplicationPageBase;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;

import java.util.ArrayList;
import java.util.List;

public class TestHomePage extends ApplicationPageBase {

    HomePage homePage;

    @BeforeMethod
    public void setUp(){homePage = PageFactory.initElements(driver,HomePage.class);}
    @Test
    public void homePageTitleTest(){
        String title = homePage.getHomePageTitle();
        Assert.assertEquals(title,"NBC TV Network - Shows, Episodes, Schedule");
    }
    @Test
    public void logoDisplayTest(){
        boolean display = homePage.nbcLogo();
        Assert.assertTrue (display);
    }
    @Test
    public void logoEnabled(){
        boolean actual = homePage.logoEnabled ();
        Assert.assertTrue (actual);
    }
    @Test
    public void slideShowContainerTest(){
        boolean display = homePage.SlideshowContainerDisplay();
        Assert.assertTrue (display);
    }
    @Test
    public void tabNameCheckHomePage(){
        List<String> expected = homePage.spellcheckHomePageExpected();
        List<String> actual = homePage.spellCheckHomePage();
        Assert.assertEquals(actual,expected);
    }
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
    @Test
    public void showFrameItems(){
        List actual = homePage.showFrameItems ();
        List expected = homePage.expectedFrameItems ();
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void houseShow(){
        boolean actual = homePage.houseShow ();
        Assert.assertTrue (actual);
    }
    @Test
    public void agtShow(){
        boolean actual = homePage.agtShow ();
        Assert.assertTrue (actual);
    }
    @Test
    public void blacklistShow(){
        boolean actual = homePage.blacklistShow ();
        Assert.assertTrue (actual);
    }
    @Test
    public void brooklynShow(){
        boolean actual = homePage.brooklynShow ();
        Assert.assertTrue (actual);
    }
}
