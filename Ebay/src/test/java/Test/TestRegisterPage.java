package Test;

import Pages.HomePage;
import Pages.RegisterPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestRegisterPage extends CommonAPI {
    RegisterPage registerPage;
    HomePage homePage;

    @BeforeMethod
    public void setRegisterPage() {
        registerPage = PageFactory.initElements(driver, RegisterPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.createaccttab();
    }
    @Test(priority = 4)
    public void registerPage() {
     String actual = registerPage.setRegisterPage();
     String expected = "Create account";
        Assert.assertEquals(actual,expected);
    }
}
