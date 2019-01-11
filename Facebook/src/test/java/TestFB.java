import Pages.Signup;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestFB extends CommonAPI {
    Signup Singnupob;

    @BeforeMethod
            public void init(){
     Singnupob = new Signup() ;}
    @Test(priority = 1)
    public void Signuptest() throws InterruptedException {
        Singnupob.signup();
    }
    @Test(priority = 2)
    public void login() throws InterruptedException {
        Singnupob.login();
    }
    @Test(priority = 3)
    public void loginPageTitleTest(){
     String  title = Singnupob.validateLoginPageTitle();
        Assert.assertEquals(title,"Facebook - Log In or Sign Up");
    }
    @Test(priority = 4)
    public void loginPageLogoTest(){
        boolean original = Singnupob.validateLogoimg();
        Assert.assertTrue(original);
    }
}

