import Pages.Pagespage;
import Pages.Signup;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PagespageTest extends CommonAPI {
    Signup signup;
    Pagespage pagespage;
    @BeforeMethod
    public void initialSetup(){
        signup = new Signup();
        pagespage = new Pagespage();
        signup.gotoprofiles();
    }
    @Test(priority = 33)
    public void ValidatePageTitle() throws InterruptedException {
        Thread.sleep(1000);
        String actual= pagespage.validatePageTitle();
        Assert.assertEquals(actual,"Security Check Required");
    }

}


