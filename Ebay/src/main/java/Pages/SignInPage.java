package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage extends CommonAPI {
    public SignInPage(){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#userid")
    WebElement userName;
    public void setUserName(String EmailID){userName.sendKeys(EmailID);}
    @FindBy(css = "#pass")
    WebElement passWord;
    public void setPassWord(String Password){passWord.sendKeys(Password);}

    }

