package Pages;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import report.TestLogger;

public class SignInPage extends CommonAPI {
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#userid")
    WebElement userName;
    @FindBy(css = "#pass")
    WebElement passWord;
    @FindBy(css = "#sgnBt")
    WebElement signButton;
    @FindBy(id = "errf")
    WebElement signin;
    public String setSignIn() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        passWord.sendKeys("12365kdkfkjkkk");
        userName.sendKeys("WrongUserName");
        signButton.click();
        String string = signin.getText();
        return string;
    }
}