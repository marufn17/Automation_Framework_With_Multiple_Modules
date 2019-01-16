package test.page.objects;

import application.page.base.ApplicationPageBase;
import application.page.base.GoogleSheetReader;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.HomePage;
import page.objects.SignInPage;
import page.objects.SignUpPage;

import java.io.IOException;
import java.util.List;
import java.util.Properties;

public class SignInPageTest extends ApplicationPageBase {
    SignInPage signInPage;
    SignUpPage signUpPage;
    HomePage homePage;
    @BeforeMethod
    public void setUp(){
        signInPage = PageFactory.initElements(driver, SignInPage.class);
        signUpPage = PageFactory.initElements(driver,SignUpPage.class);
        homePage = PageFactory.initElements(driver,HomePage.class);
        homePage.clickOnSignUp();
        signUpPage.clickOnSignIn();
    }
    @Test
    public void signInWithInvalidInfo() throws IOException {//Using Google sheet reader to verify login functionality.
        Properties properties = loadProperties();
        String spreadsheetId = properties.getProperty("GOOGLE.spreadsheetId");
        String range = properties.getProperty("GOOGLE.range");
        List<List<Object>> getRecords = GoogleSheetReader.getSpreadSheetRecords(spreadsheetId, range);
        for (List cell : getRecords) {
            String actual = signInPage.signInWithInvalidInfo(cell.get(0).toString(), cell.get(1).toString());
            String expected = cell.get(2).toString();
            Assert.assertEquals(actual, expected);
        }
    }
}
