package Test;

import Pages.FooterPage;
import Pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFooterPage extends HomePage {
    FooterPage footerPage;
    @BeforeMethod
    public void setFooterPage(){
        footerPage = PageFactory.initElements(driver, FooterPage.class);

    }
    @Test
    public void facebookLinkTest() throws InterruptedException {
        String actual = footerPage.facebookIcon();
        String expected = "https://www.facebook.com/ebay/";
        Assert.assertEquals(actual, expected);
    }
}
