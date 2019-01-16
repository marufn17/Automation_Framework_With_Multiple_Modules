package Pages;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class MessengerPage extends CommonAPI {
    public MessengerPage(){
        PageFactory.initElements(driver,this);
    }




    //Methods
    public String validatePageTitle(){
        return driver.getTitle();}
}

