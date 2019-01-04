package Pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pages extends CommonAPI {
    public Pages(){
        PageFactory.initElements(driver,this);}
        @FindBy(id = "gh-ac")
        WebElement searchbox;
    public void searchbox(){
searchbox.sendKeys("Books", Keys.ENTER);
    }


    }






