package test.page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.ThrowBack;

import java.util.List;

public class TestThrowBack extends ApplicationPageBase {
    ThrowBack throwBack;
    HomePage homePage;
    @BeforeMethod
    public void setUp(){
        homePage = PageFactory.initElements (driver,HomePage.class);
        throwBack = PageFactory.initElements (driver,ThrowBack.class);
    }
    @Test
    public void throwBackshows(){
        homePage.clickOnShows ();
        List actual = throwBack.currentList ();
        List expected = throwBack.expectedCurrentShows ();
        Assert.assertEquals (actual,expected);
    }
}
