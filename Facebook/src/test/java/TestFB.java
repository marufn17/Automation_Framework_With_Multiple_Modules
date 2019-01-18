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
    @Test(priority = 5)
    public void ClickOnEspanolTest() throws InterruptedException {
        Assert.assertEquals(Singnupob.clickOnEspanol(),true);
    }
    @Test(priority = 6)
    public void ClickonFootersignup()throws InterruptedException{
        Assert.assertEquals(Singnupob.clickOnFooterSignup(),true);
    }
    @Test(priority = 7)
    public void ClickonFooterlogin()throws InterruptedException{
        Assert.assertEquals(Singnupob.clickOnFooterLogin(),true);
    }
    @Test(priority = 8)
    public void ClickonFooterMesssengerTest()throws InterruptedException{
        Assert.assertEquals(Singnupob.clickOnFooterMessenger(),true);
    }
    @Test(priority = 9)
    public void ClickonFooterFbLiteTest()throws InterruptedException{
        Assert.assertEquals(Singnupob.clickOnFooterFbLite(),true);
    }
    @Test(priority = 10)
    public void ClickonFooterMobileTest()throws InterruptedException{
        Assert.assertEquals(Singnupob.clickOnFooterMobile(),true);
    }
    @Test(priority = 11)
    public void ClickonFooterFindFriendsTest()throws InterruptedException{
        Assert.assertEquals(Singnupob.clickOnFooterFindfriends(),true);
    }
    @Test(priority = 12)
    public void ClickonFooterPeopleTest()throws InterruptedException{
        Assert.assertEquals(Singnupob.clickOnFooterpeople(),true);
    }
    @Test(priority = 13)
    public void ClickonFooterProfileTest()throws InterruptedException{
        Assert.assertEquals(Singnupob.clickOnFooterprofiles(),true);
    }
    @Test(priority = 14)
    public void ClickonFooterPagesTest()throws InterruptedException{
        Assert.assertEquals(Singnupob.clickOnFooterpages(),true);
    }
    @Test(priority = 15)
    public void ClickonFooterPageCatagoriesTest()throws InterruptedException{
        Assert.assertEquals(Singnupob.clickOnFooterpagecatagories(),true);
    }
    @Test(priority = 16)
    public void ClickonFooterPlacesTest()throws InterruptedException{
        Assert.assertEquals(Singnupob.clickOnFooterplaces(),true);
    }
}

