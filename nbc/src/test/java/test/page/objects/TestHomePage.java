package test.page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;

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
        Assert.assertEquals(display,true);
    }
    @Test
    public void slideShowContainerTest(){
        boolean display = homePage.SlideshowContainerDisplay();
        Assert.assertEquals(display,true);
    }
    @Test
    public void popularShowBarTest(){
        String text = homePage.popularShowBar();
        Assert.assertEquals(text,"POPULAR SHOWS");
    }
    @Test
    public void newEpisodesBartest(){
        String text = homePage.newEpisodesBar();
        Assert.assertEquals(text,"NEW EPISODES");
    }
    @Test
    public void latestBarTest(){
        String text = homePage.latestBar();
        Assert.assertEquals(text,"LATEST CLIPS");
    }
    @Test
    public void fullSessionBartest(){
        String text = homePage.fullSeasonsBar();
        Assert.assertEquals(text,"WATCH FULL SEASONS");
    }
    @Test
    public void trendingNowBarTest(){
        String text = homePage.trendingNowBar();
        Assert.assertEquals(text,"TRENDING NOW");
    }
    @Test
    public void clickShows(){
        String actualText = homePage.clickShows();
        Assert.assertEquals(actualText,"SHOWS");
    }
    @Test
    public void clickEpisodes(){
        String text = homePage.clickEpisods();
        Assert.assertEquals(text,"EPISODES");
    }
    @Test
    public void clickSchedule(){
        String text = homePage.clickSchedule();
        Assert.assertEquals(text,"SCHEDULE");
    }
    @Test
    public void clickNewsAndSports(){
        String text = homePage.clickNewsAndSports();
        Assert.assertEquals(text,"NEWS & SPORTS");
    }
    @Test
    public void clickShop(){
        String text = homePage.clickShops();
        Assert.assertEquals(text,"SHOP");
    }
    @Test
    public void clickApp(){
        String text = homePage.clickApp();
        Assert.assertEquals(text,"APP");
    }
    @Test
    public void clickLive(){
        String text = homePage.clickLive();
        Assert.assertEquals(text,"LIVE");
    }
    @Test
    public void clickSearch(){
        String text = homePage.clickSearch();
        Assert.assertEquals(text,"");
    }
    @Test
    public void clickSignup(){
        String text = homePage.clickSignup();
        Assert.assertEquals(text,"SIGN UP");
    }
}
