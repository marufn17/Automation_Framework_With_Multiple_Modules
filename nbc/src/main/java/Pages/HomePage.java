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
    public void getHomePageTitle(){
        try{String title = driver.getTitle();
            Assert.assertEquals(title,"NBC TV Network - Shows, Episodes, Schedule");
            System.out.println("Home page title test passed");
        }catch (AssertionError as){System.out.println("Home page title test failed");}
    }
    @FindBy(css = ".navigation__logo")WebElement nbclogo;
    public void nbcLogo(){
        try{boolean display = nbclogo.isDisplayed();
            Assert.assertEquals(display,true);
            System.out.println("Logo test passed");
        }catch (AssertionError as){System.out.println("Logo Test Failed");}
    }
    @FindBy(css = ".slideshow__container")
    WebElement slideshowContainer;
    public void SlideshowContainerDisplay(){
        try{boolean display = slideshowContainer.isDisplayed();
            Assert.assertEquals(display,true);
            System.out.println("Slide show container test passed");
        }catch (AssertionError as){System.out.println("Slide show container");}
    }
    @FindBy(css = ".section-heading__title")WebElement popularShowTitle;
    public void popularShowBar(){
        String text = popularShowTitle.getText();
        Assert.assertEquals(text,"POPULAR SHOWS");
    }
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/div/section[2]/div/div[1]/h2") WebElement newepisodes;
    public void newEpisodesBar(){
        String text = newepisodes.getText();
        Assert.assertEquals(text,"NEW EPISODES");
    }
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/div/section[3]/div/div[1]/h2") WebElement latestbar;
    public void latestBar(){
        String text = latestbar.getText();
        Assert.assertEquals(text,"LATEST CLIPS");
    }
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/div/section[4]/div/div[1]/h2") WebElement fullsession;
    public void fullSesisonBar(){
        String text = fullsession.getText();
        Assert.assertEquals(text,"WATCH FULL SEASONS");
    }
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/div/section[5]/div/div[1]/h2") WebElement trendingnow;
    public void trendinNowBar(){
        String text = trendingnow.getText();
        Assert.assertEquals(text,"TRENDING NOW");
    }


}
