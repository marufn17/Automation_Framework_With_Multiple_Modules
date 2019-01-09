package test.page.objects;

import application.page.base.ApplicationPageBase;
import application.page.base.XlsxDataReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page.objects.FooterPage;

import java.io.File;
import java.util.ArrayList;
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
    public void webElementName(){
        List actual = footerPage.webElementList();
        List expected = footerPage.expectedWebElement();
        Assert.assertEquals(actual,expected);
    }

}
