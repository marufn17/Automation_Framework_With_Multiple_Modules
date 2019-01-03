package TestPages;
import Pages.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    HomePage homePage;


    @BeforeMethod
    public void setUp(){homePage = PageFactory.initElements(driver,HomePage.class);}

    @Test
    public void homePageTitleTest(){homePage.getHomePageTitle();}
    @Test
    public void logoDisplayTest(){homePage.nbcLogo();}
    @Test
    public void slideShowContainerTest(){homePage.SlideshowContainerDisplay();}
    @Test
    public void popularShowBarTest(){homePage.popularShowBar();}
    @Test
    public void newEpisodesBartest(){homePage.newEpisodesBar();}
    @Test
    public void latestBarTest(){homePage.latestBar();}
    @Test
    public void fullSessionBartest(){homePage.fullSesisonBar();}
    @Test
    public void trendingNowBarTest(){homePage.trendinNowBar();}
}
