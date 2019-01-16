package test.page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.UpComingShows;
import java.util.List;

public class TestUpComingShows extends ApplicationPageBase {
    UpComingShows upComingShows;
    HomePage homePage;
    @BeforeMethod
    public void setUp (){
        upComingShows = PageFactory.initElements (driver,UpComingShows.class);
        homePage = PageFactory.initElements (driver,HomePage.class);
    }
    @Test
    public void upcommingShows(){
        homePage.clickOnShows ();
        List actual = upComingShows.upcomingList ();
        List expected = upComingShows.expectedCurrentShows ();
        Assert.assertEquals (actual,expected);
    }
}
