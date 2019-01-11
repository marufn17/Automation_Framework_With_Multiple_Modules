import Pages.NewsFeedPage;
import Pages.Signup;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

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
    @Test
    public void postAreaTest() throws InterruptedException {
        Assert.assertEquals(newsfadepage.PostArea(),true);

    }
    @Test
    public void postTest() throws InterruptedException {
        boolean actual =newsfadepage.PostSomething();
        Assert.assertEquals(actual,true);
    }
    @Test
    public void DelpodtTest() throws InterruptedException {
        newsfadepage.DeletePost();
    }
    @Test
    public void PhotoUploadTest() throws InterruptedException, AWTException {
        newsfadepage.photoupload();
        }
    }

