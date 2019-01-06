package Pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "gh-ac")
    WebElement searchbox;

    public void searchbox() {
        searchbox.sendKeys("Books", Keys.ENTER);
    }

    @FindBy(xpath = "//a[contains(text(),'register')]")

    WebElement createacct;

    public void createacct() {

        createacct.click();
    }

    @FindBy(id = "gh-ac")

    WebElement searchItem;

    public void setSearchItem() {
        searchItem.sendKeys("Toys");
        searchItem.click();

    }

    @FindBy(linkText = "Motors")

    WebElement searchMotortab;

    public void motortab() {

        searchMotortab.click();


    }

    @FindBy(xpath = "//a[contains(text(),'register')]")

    WebElement dailydeals;

    public void dailydealstab() {
        dailydeals.click();

    }

    @FindBy(linkText = "Fashion")


    WebElement fashion;

    public void fashiontab() {

        fashion.click();

    }

    @FindBy(linkText = "Electronics")


    WebElement electronics;

    public void electronicstab() {

        electronics.click();

    }
}










