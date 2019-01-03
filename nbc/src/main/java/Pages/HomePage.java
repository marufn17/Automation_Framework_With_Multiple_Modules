package Pages;
import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends CommonAPI {
    public HomePage(){PageFactory.initElements(driver,this);}

    @FindBy(css = ".navigation__logo") private WebElement nbclogo;
    @FindBy(css = ".slideshow__container") private WebElement slideshowContainer;
    @FindBy(css = ".section-heading__title") private WebElement popularShowTitle;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/div/section[2]/div/div[1]/h2") private WebElement newepisodes;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/div/section[3]/div/div[1]/h2") private WebElement latestbar;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/div/section[4]/div/div[1]/h2") private WebElement fullsession;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/div/section[5]/div/div[1]/h2") private WebElement trendingnow;

    public void getHomePageTitle(){
        String title = driver.getTitle();
        Assert.assertEquals(title,"NBC TV Network - Shows, Episodes, Schedule");
    }
    public void nbcLogo(){
        boolean display = nbclogo.isDisplayed();
        Assert.assertEquals(display,true);
    }
    public void SlideshowContainerDisplay(){
       boolean display = slideshowContainer.isDisplayed();
       Assert.assertEquals(display,true);
    }
    public void popularShowBar(){
        String text = popularShowTitle.getText();
        Assert.assertEquals(text,"POPULAR SHOWS");
    }
    public void newEpisodesBar(){
        String text = newepisodes.getText();
        Assert.assertEquals(text,"NEW EPISODES");
    }
    public void latestBar(){
        String text = latestbar.getText();
        Assert.assertEquals(text,"LATEST CLIPS");
    }
    public void fullSesisonBar(){
        String text = fullsession.getText();
        Assert.assertEquals(text,"WATCH FULL SEASONS");
    }
    public void trendinNowBar(){
        String text = trendingnow.getText();
        Assert.assertEquals(text,"TRENDING NOW");
    }



}
