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
    @Test
    public void Signuptest() throws InterruptedException {
        Singnupob.signup();
    }
    @Test
    public void login() throws InterruptedException {
        Singnupob.login();
    }
    @Test
    public void loginPageTitleTest(){
     String  title = Singnupob.validateLoginPageTitle();
        Assert.assertEquals(title,"Facebook - Log In or Sign Up");
    }
    @Test
    public void loginPageLogoTest(){
        boolean original = Singnupob.validateLogoimg();
        Assert.assertTrue(original);
    }
}

