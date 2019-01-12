package Pages;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class Pagespage extends CommonAPI {
    public Pagespage(){
        PageFactory.initElements(driver,this);
    }




    //Methods
    public String validatePageTitle(){
        return driver.getTitle();}
}
