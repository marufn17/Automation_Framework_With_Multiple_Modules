package test.page.objects;

import application.page.base.ApplicationPageBase;
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
        Assert.assertEquals(display,true);
    }
    @Test
    public void slideShowContainerTest(){
        boolean display = homePage.SlideshowContainerDisplay();
        Assert.assertEquals(display,true);
    }

    @Test
    public void barNameCheckHomePage(){
        List<String> expected = new ArrayList<>();
        expected.add("POPULAR SHOWS");
        expected.add("NEW EPISODES");
        expected.add("GOLDEN GLOBES HIGHLIGHTS");
        expected.add("WATCH FULL SEASONS");
        expected.add("TRENDING NOW");
        expected.add("SHOWS");
        expected.add("EPISODES");
        expected.add("SCHEDULE");
        expected.add("NEWS & SPORTS");
        expected.add("SHOP");
        expected.add("APP");
        expected.add("LIVE");
        expected.add("SIGN UP");
        List<String> actual = homePage.spellCheckHomePage();
        Assert.assertEquals(expected,actual);
    }



//    @Test
//    public void clickSearch(){
//        String text = homePage.clickSearch();
//        Assert.assertEquals(text,"");
//    }

}
