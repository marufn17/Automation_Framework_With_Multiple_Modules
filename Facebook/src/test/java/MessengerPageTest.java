import Pages.MessengerPage;
import Pages.NewsFeedPage;
import Pages.Signup;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MessengerPageTest extends CommonAPI {
    MessengerPage messengerPage;
    Signup signup;
    NewsFeedPage newsFeedPage;
    @BeforeMethod
    public void setupProfilepagetest() throws InterruptedException {
        messengerPage =new MessengerPage();
        signup = new Signup();
        newsFeedPage = new NewsFeedPage();
        signup.login();
        newsFeedPage.landinonmessenger();
    }
    @Test
    public void getTitleTest() throws InterruptedException {
        Thread.sleep(1000);
        String actual= messengerPage.validatePageTitle();
        Assert.assertEquals(actual,"Messenger");
    }

}


