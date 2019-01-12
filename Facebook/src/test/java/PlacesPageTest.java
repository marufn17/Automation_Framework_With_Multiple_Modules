import Pages.PlacesPage;
import Pages.Signup;
import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PlacesPageTest extends CommonAPI {
    Signup signup;
    PlacesPage placesPage;
    @BeforeMethod
    public void initialSetup(){
        signup = new Signup();
        placesPage =new PlacesPage();
        signup.gotoprofiles();
    }
    @Test(priority = 34)
    public void ValidatePageTitle() throws InterruptedException {
        Thread.sleep(1000);
        String actual= placesPage.validatePageTitle();
        Assert.assertEquals(actual,"Security Check Required");
    }

}


