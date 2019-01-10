import Pages.NewsFeedPage;
import Pages.Signup;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewsFeedPageTest extends CommonAPI {
    Signup signuppage;
    NewsFeedPage newsfadepage;

    @BeforeMethod
    public void initialsetup() throws InterruptedException {
       newsfadepage= new NewsFeedPage();
       signuppage = new Signup();
       newsfadepage = signuppage.gotonewsfeedpage();

    }
    @Test
    public void searchingfromxl() throws InterruptedException {
        newsfadepage.xltoSearchbar2();
    }
    @Test
    public void gotoprofiletest() throws InterruptedException {
        newsfadepage.gotoprofile();
        String expectedpage = "https://www.facebook.com/sele.nium.777";
        Assert.assertEquals(newsfadepage.gotoprofile(), expectedpage);
    }
    @Test
    public void gotoMessengerpageTest() throws InterruptedException {
        newsfadepage.gotoMessenger();
        String expectedpage = "https://www.facebook.com/messages/t/";
        Assert.assertEquals(newsfadepage.gotoMessenger(),expectedpage);
    }
}
