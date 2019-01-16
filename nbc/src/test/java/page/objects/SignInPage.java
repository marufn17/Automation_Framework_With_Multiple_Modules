package page.objects;

import application.page.base.ApplicationPageBase;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import report.TestLogger;

public class SignInPage extends ApplicationPageBase {
    @FindBy(css = "[name='email']")
    WebElement emailBox;
    @FindBy(css = "#password-input__password")
    WebElement passwordBox;
    @FindBy(css = "[tabindex] span:nth-of-type(1) span")
    WebElement signInTab;
    @FindBy(css = ".flash-messages__message--undefined span")
    WebElement errorMessage;

    public String signInWithInvalidInfo(String userName, String password){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        emailBox.sendKeys(userName);
        passwordBox.sendKeys(password);
        signInTab.click();
        String errorText = errorMessage.getText();
        return errorText;
    }
}
