package test.page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.FooterPage;

public class FooterSocialMediaTest extends ApplicationPageBase {
    FooterPage footerPage;
    @BeforeMethod
    public void setUP(){
        footerPage = PageFactory.initElements(driver,FooterPage.class);
    }
    @Test
    public void fbLinkTest() throws InterruptedException {
        String actual = footerPage.fbIcon();
        String expected = "https://www.facebook.com/nbc";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void twitterLinkTest() throws InterruptedException {
        String actual = footerPage.twitterIcon ();
        String expected = "https://twitter.com/nbc";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void tumbLinkTest() throws InterruptedException {
        String actual = footerPage.tumbIcon ();
        String expected = "http://nbctv.tumblr.com/";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void pinLinkTest() throws InterruptedException {
        String actual = footerPage.pinIcon ();
        String expected = "https://www.pinterest.com/nbctv/";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void gPlusLinkTest() throws InterruptedException {
        String actual = footerPage.gplusIcon ();
        String expected = "https://plus.google.com/+NBC";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void yTubeLinkTest() throws InterruptedException {
        String actual = footerPage.yTubelusIcon ();
        String expected = "https://www.youtube.com/nbc";
        Assert.assertEquals (actual,expected);
    }
}
