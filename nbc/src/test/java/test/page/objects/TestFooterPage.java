package test.page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.FooterPage;
import java.util.List;

public class TestFooterPage extends ApplicationPageBase {
    FooterPage footerPage;
    @BeforeMethod
    public void setUP(){
        footerPage = PageFactory.initElements(driver,FooterPage.class);
    }
    @Test
    public void isFooterLogoDisplayed(){
        boolean logo = footerPage.isFooterLogoDisplayd();
        Assert.assertEquals(logo,true);
    }
    @Test
    public void webElementName(){// data driven test, using data from excel sheets (XLSX format)
        List actual = footerPage.webElementList();
        List expected = footerPage.expectedWebElementXlsx();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void excelTest(){// data driven test, using data from excel sheets (XLS format)
        List actual = footerPage.webElementList();
        List expected = footerPage.expectedWebElementXls();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void ticketAndNbc() throws InterruptedException {
        String actual = footerPage.ticketAndNbc();
        String expect = footerPage.ticketAndNbc();
        Assert.assertEquals(actual,expect);
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
    @Test
    public void nbcLink() throws InterruptedException {
        String actual = footerPage.nbcLink ();
        String expected = "https://www.nbc.com/apps";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void faqLink() throws InterruptedException {
        String actual = footerPage.faqLink ();
        String expected = "https://www.nbc.com/general/pages/faq";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void castingLink() throws InterruptedException {
        String actual = footerPage.castingLink ();
        String expected = "https://www.nbc.com/exclusives/pages/casting";
        Assert.assertEquals (actual,expected);
    }

    @Test
    public void parentalRatingLink() throws InterruptedException {
        String actual = footerPage.parentalLink ();
        String expected = "https://www.nbc.com/global/pages/tv-ratings";
        Assert.assertEquals (actual,expected);
    }
    @Test
    public void accessibilityLink() throws InterruptedException {
        String actual = footerPage.accessibilityLink ();
        String expected = "https://www.nbc.com/general/pages/accessibility";
        Assert.assertEquals (actual,expected);
    }
}
