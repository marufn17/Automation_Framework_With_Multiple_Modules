import Pages.NewsFeedPage;
import Pages.Signup;
import base.CommonAPI;
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
        newsfadepage.xltoSearchBar();
    }
}
