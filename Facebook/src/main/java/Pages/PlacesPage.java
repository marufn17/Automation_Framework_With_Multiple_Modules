package Pages;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class PlacesPage extends CommonAPI {
    public PlacesPage(){
        PageFactory.initElements(driver,this);
    }




    //Methods
    public String validatePageTitle(){
        return driver.getTitle();}
}
