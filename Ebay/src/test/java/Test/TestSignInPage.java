package Test;

import Helper.GoogleSheetReader;
import Pages.HomePage;
import Pages.SignInPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import report.TestLogger;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class TestSignInPage extends CommonAPI {
    SignInPage signInPage;
    HomePage homePage;
    @BeforeMethod
    public void setSignInPage(){
        signInPage = PageFactory.initElements(driver,SignInPage.class);
        homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.setSingin();
    }
    @Test(priority = 1)
    public void usernamefield(){signInPage.setUserName("abc@pnt.com");
    }
    @Test(priority = 2)
    public void passwordfield(){signInPage.setPassWord("abc@123");}

    }


