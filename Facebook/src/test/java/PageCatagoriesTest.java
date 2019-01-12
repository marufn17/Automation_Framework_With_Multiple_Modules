import Pages.PageCatagoriesPage;
import Pages.Signup;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PageCatagoriesTest extends CommonAPI {
    Signup signup;
    PageCatagoriesPage pageCatagoriesPage;
    @BeforeMethod
    public void initialSetup(){
        signup = new Signup();
        pageCatagoriesPage = new PageCatagoriesPage();
        signup.gotoprofiles();
    }
    @Test(priority = 35)
    public void ValidatePageTitle() throws InterruptedException {
        Thread.sleep(1000);
        String actual= pageCatagoriesPage.validatePageTitle();
        Assert.assertEquals(actual,"Security Check Required");
    }

}


