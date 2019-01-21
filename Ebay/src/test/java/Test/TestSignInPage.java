package Test;
import Pages.HomePage;
import Pages.SignInPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TestSignInPage extends CommonAPI {
    SignInPage signInPage;
    HomePage homePage;
    @BeforeMethod
    public void setSignInPage() {
        signInPage = PageFactory.initElements(driver, SignInPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.setSingin();
    }
    @Test(priority = 1)
    public void singInpage() throws InterruptedException {
        String actual = signInPage.setSignIn();
        String expected = "Oops, that's not a match.";
        Assert.assertEquals(actual, expected);
    }
}


