package test.page.objects;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.SignUpPage;
import java.util.List;

public class TestSignUpPage extends CommonAPI {
    SignUpPage signUpPage;
    HomePage homePage;
    @BeforeMethod
    public void setUp(){
        signUpPage = PageFactory.initElements(driver,SignUpPage.class);
        homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnSignUp();
    }
    @Test
    public void withoutInfo(){
        List actual = signUpPage.withoutInfo();
        List expected = signUpPage.expectedMessagewithoutInfo();
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void invalidEmailSignup(){
        String actual = signUpPage.invalidEmailSignup();
        String expected = "We're unable to verify your email. Please try again";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void invalidPassSignup(){
        String actual = signUpPage.invalidPassSignup();
        String expected = "We could not create your account, please try again later.";
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void withoutTermsignup(){
        String actual = signUpPage.withoutTermsignup();
        String expected = "Please check the box to continue.";
        Assert.assertEquals(actual,expected);
    }
}
