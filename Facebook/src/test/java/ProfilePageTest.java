import Pages.NewsFeedPage;
import Pages.ProfilePage;
import Pages.Signup;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ProfilePageTest extends CommonAPI {
    ProfilePage profilePage;
    Signup signup;
    NewsFeedPage newsFeedPage;
    @BeforeMethod
    public void setupProfilepagetest() throws InterruptedException {
        profilePage = new ProfilePage();
        signup = new Signup();
        newsFeedPage = new NewsFeedPage();
        signup.login();
        newsFeedPage.landinonprofile();
    }
    @Test
    public void getTitleTest() throws InterruptedException {
        Thread.sleep(1000);
        String actual= profilePage.validateLoginPageTitle();
        Assert.assertEquals(actual,"Sele Nium");
    }
}
