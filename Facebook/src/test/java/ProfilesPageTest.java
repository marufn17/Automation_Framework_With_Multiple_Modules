import Pages.ProfilesPage;
import Pages.Signup;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfilesPageTest extends CommonAPI {
    Signup signup;
    ProfilesPage profilesPage;
    @BeforeMethod
    public void initialSetup(){
         signup = new Signup();
         profilesPage = new ProfilesPage();
        signup.gotoprofiles();
    }
    @Test(priority = 35)
    public void ValidatePageTitle() throws InterruptedException {
        Thread.sleep(1000);
        String actual= profilesPage.validatePageTitle();
        Assert.assertEquals(actual,"Security Check Required");
    }

}
