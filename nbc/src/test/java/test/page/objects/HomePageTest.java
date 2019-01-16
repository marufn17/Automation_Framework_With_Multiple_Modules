package test.page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;;
import java.util.List;

public class HomePageTest extends ApplicationPageBase {

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
