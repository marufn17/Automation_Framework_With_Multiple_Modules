package test.page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.CurrentShows;
import page.objects.HomePage;
import java.util.List;

public class TestCurrentShows extends ApplicationPageBase {
    CurrentShows currentShows;
    HomePage homePage;
    @BeforeMethod
    public void setUP(){
        currentShows = PageFactory.initElements (driver,CurrentShows.class);
        homePage = PageFactory.initElements (driver, HomePage.class);
    }
    @Test
    public void currentShowsTitle(){//Using data from array list
        homePage.clickOnShows ();
        List actual = currentShows.currentList ();
        List expectted = currentShows.expectedCurrentShows ();
        Assert.assertEquals (actual,expectted);
    }
}
