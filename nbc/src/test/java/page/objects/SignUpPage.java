package page.objects;

import base.CommonAPI;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.net.PortUnreachableException;
import java.util.ArrayList;
import java.util.List;

public class SignUpPage extends CommonAPI {
    @FindBy(id = "signup-form__email")
    WebElement signUpEmail;
    @FindBy(id = "password-input__password")
    WebElement signUpPass;
    @FindBy (xpath = "//label[@class='signup-form__terms-checkbox']")
    WebElement termClick;
    @FindBy(xpath = "//main[@id=\'main\']/div[1]/div/div/main/div[2]/div/section[2]/div[1]/form/div[4]/button/span/span")
    WebElement signUpButton;
    @FindBy(xpath = "//div[@class='signup-form__error-message signup-form__error-message--email']")
    WebElement emailError;
    @FindBy(xpath = "//div[@class='password-input__error-message']")
    WebElement passError;
    @FindBy(xpath = "//div[@class='signup-form__error-message signup-form__error-message--terms']")
    WebElement tickError;
    @FindBy(css = "#main > div.responsive-app__wrapper > div > div > main > div.flash-messages > div > span")
    WebElement errorMessage;

    public List withoutInfo(){
        List<String> list = new ArrayList<>();
        signUpButton.click();
        list.add(emailError.getText());
        System.out.println(emailError.getText());
        list.add(passError.getText());
        System.out.println(passError.getText());
        list.add(tickError.getText());
        System.out.println(tickError.getText());
        return list;
    }
    public List expectedMessagewithoutInfo(){
        List<String> list = new ArrayList<>();
        list.add("This field is required.");
        list.add("This field is required.");
        list.add("Please check the box to continue.");
       return list;
    }
    public String invalidEmailSignup(){
        signUpEmail.sendKeys("test@gmail.com");
        signUpPass.sendKeys("12345");
        termClick.click();
        signUpButton.click();
        String text = emailError.getText();
        return text;
    }
    public String invalidPassSignup(){
        signUpEmail.sendKeys("md.marufahmad@yahoo.com");
        signUpPass.sendKeys("     00");
        termClick.click();
        signUpButton.click();
        String text = errorMessage.getText();
        return text;
    }
    public String withoutTermsignup(){
        signUpEmail.sendKeys("md.marufahmad@yahoo.com");
        signUpPass.sendKeys("123456");
        signUpButton.click();
        String text = tickError.getText();
        return text;
    }

}
