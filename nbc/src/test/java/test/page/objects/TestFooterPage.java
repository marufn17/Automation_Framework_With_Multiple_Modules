package test.page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.FooterPage;

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

}
