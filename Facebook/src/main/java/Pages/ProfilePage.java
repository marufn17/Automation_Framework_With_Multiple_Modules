package Pages;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage extends CommonAPI {
    public ProfilePage(){
        PageFactory.initElements(driver,this);
    }




    //Methods
    public String validateLoginPageTitle(){
        return driver.getTitle();}
}