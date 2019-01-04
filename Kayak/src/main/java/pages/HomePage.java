package pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {

    public HomePage(){

        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "BrM8")
    WebElement flighttab;

    public void setFlighttabsearch(){
        flighttab.sendKeys();
    }
}
