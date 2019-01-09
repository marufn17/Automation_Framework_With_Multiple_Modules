package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class FooterPage extends ApplicationPageBase {

    @FindBy(how = How.CSS, css = "#main > footer > div.footer__logo > a")
    WebElement footerLogo;

    public boolean isFooterLogoDisplayd(){
        boolean logo = footerLogo.isDisplayed();
        return logo;
    }
}
