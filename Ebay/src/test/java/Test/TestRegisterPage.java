package Test;

import Pages.HomePage;
import Pages.RegisterPage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

    public class TestRegisterPage extends CommonAPI {
    RegisterPage registerPage;
    HomePage homePage;

    @BeforeMethod
   public void setRegisterPage(){
        registerPage = PageFactory.initElements(driver,RegisterPage.class);
        homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.createaccttab();
    }
    @Test(priority = 1)
    public void firstNamefield(){
        registerPage.setFirstName("Safwan");
    }
    @Test(priority = 2)
    public void lastNamefield(){
        registerPage.setLastName("Rahman");
    }
    @Test(priority = 3)
        public void emailfield(){
        registerPage.setEmail("safwan@pnt.com");
    }
    @Test(priority = 4)
        public void passwordfield(){
        registerPage.setPassword();
    }
}
