package page.objects;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage extends CommonAPI {
    public HomePage(){PageFactory.initElements(driver,this);}

    @FindBy(css = ".navigation__logo") WebElement nbclogo;
    @FindBy(css = ".slideshow__container") WebElement slideshowContainer;
    @FindBy(css = ".section-heading__title") WebElement popularShowTitle;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/div/section[2]/div/div[1]/h2") WebElement newepisodes;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/div/section[3]/div/div[1]/h2") WebElement latestbar;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/div/section[4]/div/div[1]/h2") WebElement fullsession;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/div/section[5]/div/div[1]/h2") WebElement trendingnow;

    public String getHomePageTitle(){
        String title = driver.getTitle();
        return title;
    }
    public boolean nbcLogo(){
        boolean display = nbclogo.isDisplayed();
        return display;
    }
    public boolean SlideshowContainerDisplay(){
       boolean display = slideshowContainer.isDisplayed();
       return display;
    }
    public String popularShowBar(){
        String text = popularShowTitle.getText();
        return text;
    }
    public String newEpisodesBar(){
        String text = newepisodes.getText();
        return text;
    }
    public String latestBar(){
        String text = latestbar.getText();
        return text;
    }
    public String fullSesisonBar(){
        String text = fullsession.getText();
        return text;
    }
    public String trendingNowBar(){
        String text = trendingnow.getText();
        return text;
    }
}
