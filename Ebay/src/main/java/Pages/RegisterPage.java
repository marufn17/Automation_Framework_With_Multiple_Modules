package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends CommonAPI {
    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#firstname")
    WebElement firstName;
    public void setFirstName(String FirstName) {
        firstName.sendKeys(FirstName);
    }
    @FindBy(css = "#lastname")
    WebElement lastName;
    public void setLastName(String LastName) {
        lastName.sendKeys(LastName);
    }
    @FindBy(css = "#email")
    WebElement email;
    public void setEmail(String Email) {
        email.sendKeys(Email);
    }
    @FindBy(css = "#PASSWORD")
    WebElement password;
    public void setPassword() {
        password.sendKeys("abc@123");
    }
}