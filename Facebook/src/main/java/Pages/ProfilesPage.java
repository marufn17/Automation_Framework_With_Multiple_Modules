package Pages;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class ProfilesPage extends CommonAPI {
    public ProfilesPage(){
        PageFactory.initElements(driver,this);
    }




    //Methods
    public String validatePageTitle(){
        return driver.getTitle();}
}
