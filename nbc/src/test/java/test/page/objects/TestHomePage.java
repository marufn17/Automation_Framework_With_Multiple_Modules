package test.page.objects;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;

public class TestHomePage extends CommonAPI {

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
        String text = homePage.fullSesisonBar();
        Assert.assertEquals(text,"WATCH FULL SEASONS");
    }
    @Test
    public void trendingNowBarTest(){
        String text = homePage.trendingNowBar();
        Assert.assertEquals(text,"TRENDING NOW");
    }

}
