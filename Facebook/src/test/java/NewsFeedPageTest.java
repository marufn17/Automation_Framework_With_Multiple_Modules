import Pages.NewsFeedPage;
import Pages.Signup;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class NewsFeedPageTest extends CommonAPI {
    Signup signuppage;
    NewsFeedPage newsfadepage;

    @BeforeMethod
    public void initialsetup() throws InterruptedException {
        newsfadepage = new NewsFeedPage();
        signuppage = new Signup();
        newsfadepage = signuppage.gotonewsfeedpage();


    }

    @Test(priority = 17)
    public void searchingfromxl() throws InterruptedException {
        newsfadepage.xltoSearchbar2();
    }

    @Test(priority = 18)
    public void gotoprofiletest() throws InterruptedException {
        newsfadepage.gotoprofile();
        String expectedpage = "https://www.facebook.com/sele.nium.777";
        Assert.assertEquals(newsfadepage.gotoprofile(), expectedpage);
    }

    @Test(priority = 19)
    public void gotoMessengerpageTest() throws InterruptedException {
        newsfadepage.gotoMessenger();
        String expectedpage = "https://www.facebook.com/messages";
        Assert.assertEquals(newsfadepage.gotoMessenger(), expectedpage);
    }

    @Test(priority = 20)
    public void postAreaTest() throws InterruptedException {
        Assert.assertEquals(newsfadepage.PostArea(), true);

    }

    @Test(priority = 21)
    public void postTest() throws InterruptedException {
        boolean actual = newsfadepage.PostSomething();
        Assert.assertEquals(actual, true);
    }

    @Test(priority = 24)
    public void DelpodtTest() throws InterruptedException {
        newsfadepage.DeletePost();
    }

    @Test(priority = 25)
    public void PhotoUploadTest() throws InterruptedException, AWTException {
        newsfadepage.photoupload();
        Thread.sleep(5000);
    }

    @Test(priority = 23)
    public void CommentOnPostTest() throws InterruptedException {
        newsfadepage.commentOnPost();
        Thread.sleep(5000);
    }

    @Test(priority = 22)
    public void LikeonpostTest() throws InterruptedException {
        newsfadepage.likeonpost();
    }

    @Test(priority = 29)
    public void SearchFromDbTest() throws Exception {
        newsfadepage.searchfromdatabase();
        Assert.assertEquals(newsfadepage.searchfromdatabase(), newsfadepage.Expected());
    }

    @Test(priority = 26)
    public void LikeonphotoTest2() throws InterruptedException {
        newsfadepage.likeonpost();
    }

    @Test(priority = 27)
    public void CommentOnPhotoTest2() throws InterruptedException {
        newsfadepage.commentOnPost();
        Thread.sleep(3000);
    }

    @Test(priority = 28)
    public void DelphotoTest() throws InterruptedException {
        newsfadepage.DeletePost();
    }
    @Test
    public void searchFromGoogleSheetTest() throws IOException, InterruptedException {
        Thread.sleep(1000);
        newsfadepage.searchFromGoogleSheet();
        Thread.sleep(1000);
    }
}


