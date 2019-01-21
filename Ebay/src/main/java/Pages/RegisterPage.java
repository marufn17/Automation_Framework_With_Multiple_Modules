package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import report.TestLogger;

public class RegisterPage extends CommonAPI {
    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#firstname")
    WebElement firstName;
    @FindBy(css = "#lastname")
    WebElement lastName;
    @FindBy(css = "#email")
    WebElement email;
    @FindBy(css = "#PASSWORD")
    WebElement password;
    @FindBy(css = "#ppaFormSbtBtn")
    WebElement createAccountButton;
    @FindBy(css = "#ocs-inflow > h3")
    WebElement userdifferntemail;
    public String setRegisterPage() {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        firstName.sendKeys("Safwan");
        lastName.sendKeys("Rahman");
        email.sendKeys("email@email.com");
        password.sendKeys("abc@123");
        createAccountButton.click();
        String string = createAccountButton.getText();
        return string;
    }
}