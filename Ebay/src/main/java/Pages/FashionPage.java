package Pages;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FashionPage extends CommonAPI {
    public FashionPage() {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#w1-w0-w7-toggle-button > span")
    WebElement healthbutton;

    public void healthtab() {
        healthbutton.click();
    }
}
