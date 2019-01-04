package Pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signup extends CommonAPI {
//Webelements
@FindBy(css = "#u_0_c")
WebElement firstname;
@FindBy(css="#email" )
WebElement useremail;
@FindBy(css ="#pass" )
WebElement password;
@FindBy(css = "#u_0_2")
WebElement button;
@FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/h1[1]/a[1]/i[1]")
WebElement Fblogoimg;




//for initializing when object will be created
public Signup(){PageFactory.initElements(driver,this);}
    //Methods
    public void signup(){
        firstname.sendKeys("Mohammed", Keys.TAB,"Mehadi",Keys.TAB, "Email",Keys.TAB,"password",
                           Keys.TAB,Keys.ARROW_DOWN,Keys.ENTER,Keys.TAB,Keys.ARROW_DOWN,Keys.ENTER,Keys.TAB,
                           Keys.ARROW_DOWN,Keys.ENTER,Keys.TAB,Keys.TAB,Keys.ARROW_RIGHT,Keys.ENTER);}
    public void login() throws InterruptedException {
    useremail.sendKeys("selenium925@gmail.com");
    password.sendKeys("(qazxsw)1234");
    button.click();
    Thread.sleep(1000);
    }
    public String validateLoginPageTitle(){
    return driver.getTitle();}
    public boolean validateLogoimg(){
    return Fblogoimg.isDisplayed(); }
}
