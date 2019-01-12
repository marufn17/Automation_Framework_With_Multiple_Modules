package Pages;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;

public class PageCatagoriesPage extends CommonAPI {
    public PageCatagoriesPage(){
        PageFactory.initElements(driver,this);
    }




    //Methods
    public String validatePageTitle(){
        return driver.getTitle();}
}




