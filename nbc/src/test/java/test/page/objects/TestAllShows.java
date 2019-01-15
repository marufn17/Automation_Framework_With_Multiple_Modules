package test.page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.AllShows;
import page.objects.HomePage;
import java.util.List;

public class TestAllShows extends ApplicationPageBase {
    AllShows allShows;
    HomePage homePage;
    @BeforeMethod
    public void setUP(){
        allShows = PageFactory.initElements(driver,AllShows.class);
        homePage = PageFactory.initElements(driver,HomePage.class);
    }
    @Test
    public void allShowsTabText(){
        homePage.clickOnShows();
        String actual = allShows.allShows();
        Assert.assertEquals(actual,"ALL");
    }
    @Test
    public void allShowsTitle(){//Using data from array list
        homePage.clickOnShows();
        List actual = allShows.list();
        List expected = allShows.expectedAllShows();
        Assert.assertEquals(actual,expected);
    }
}
