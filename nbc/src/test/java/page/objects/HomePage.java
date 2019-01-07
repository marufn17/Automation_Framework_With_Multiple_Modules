package page.objects;
import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends ApplicationPageBase {

    @FindBy(how = How.CSS, css = ".navigation__logo")
    WebElement nbclogo;
    @FindBy(how = How.CSS, css = ".slideshow__container")
    WebElement slideshowContainer;
    @FindBy(how = How.CSS, css = ".section-heading__title")
    WebElement popularShowTitle;
    @FindBy(how = How.XPATH, xpath = "//*[@id=\'main\']/div[1]/div/div/section[2]/div/div[1]/h2")
    WebElement newepisodes;
    @FindBy(how = How.XPATH, xpath = "//*[@id=\'main\']/div[1]/div/div/section[3]/div/div[1]/h2")
    WebElement latestbar;
    @FindBy(how = How.XPATH, xpath = "//*[@id=\'main\']/div[1]/div/div/section[4]/div/div[1]/h2")
    WebElement fullseasons;
    @FindBy(how = How.XPATH, xpath = "//*[@id=\'main\']/div[1]/div/div/section[5]/div/div[1]/h2")
    WebElement trendingnow;
    @FindBy(how = How.XPATH, xpath = "//*[@id=\'app\']/div/header/div/div/nav/div/ul/li[2]/button/span")
    WebElement showstab;
    @FindBy(how = How.CSS, css = "#app > div > header > div > div > nav > div > ul > li:nth-child(3) > a > span")
    WebElement episodesTab;
    @FindBy(how = How.CSS, css = "#app > div > header > div > div > nav > div > ul > li:nth-child(4) > a > span")
    WebElement scheduleTab;
    @FindBy(how = How.CSS, css = "#app > div > header > div > div > nav > div > ul > li:nth-child(5) > button > span")
    WebElement newsAndSportsTab;
    @FindBy(how = How.CSS, css = "#app > div > header > div > div > nav > div > ul > li:nth-child(6) > a > span")
    WebElement shopsTab;
    @FindBy(how = How.CSS, css = "#app > div > header > div > div > nav > div > ul > li:nth-child(7) > a > span")
    WebElement appTab;
    @FindBy(how = How.XPATH, xpath = "//*[@id=\'app\']/div/header/div/div/nav/div/ul/li[8]/a/span")
     WebElement liveTab;
    @FindBy(how = How.CSS, css = "#app > div > header > div > div > nav > div > ul > li.navigation__item.navigation__item--search > button")
    WebElement searchTab;
    @FindBy(how = How.XPATH, xpath = "//*[@id=\'app\']/div/header/div/div/nav/div/ul/li[10]/div/a/span")
    WebElement signUPTab;

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

    public List spellCheckHomePage(){//to check spelling of all the tab
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(popularShowTitle);
        webElements.add(newepisodes);
        webElements.add(latestbar);
        webElements.add(fullseasons);
        webElements.add(trendingnow);
        webElements.add(showstab);
        webElements.add(episodesTab);
        webElements.add(scheduleTab);
        webElements.add(newsAndSportsTab);
        webElements.add(shopsTab);
        webElements.add(appTab);
        webElements.add(liveTab);
        webElements.add(signUPTab);

        List<String> list = new ArrayList<>();
        for (int i =0; i<webElements.size(); i++){
            list.add(webElements.get(i).getText());
            System.out.println(webElements.get(i).getText());
        }
        return list;
    }












//    public String popularShowBar(){
//        String text = getText(popularShowTitle,"Popular Shows ");
//        return text;
//    }
//    public String newEpisodesBar(){
//        String text = getText(newepisodes,"New Episodes ");
//        return text;
//    }
//    public String latestBar(){
//        String text = getText(latestbar,"Latest");
//        return text;
//    }
//    public String fullSeasonsBar(){
//        String text = getText(fullseasons, "Full Seasons");
//        return text;
//    }
//    public String trendingNowBar(){
//        String text = getText(trendingnow, "Trending");
//        return text;
//    }
//
//
//
//
//
//
//
//
//
//
//
//    public void clickOnShows(){
//        showstab.click();
//    }
//    public String clickShows(){
//        String text = showstab.getText();
//        return text;
//    }
//    public void clickOnEpisods(){
//        episodesTab.click();
//    }
//    public String clickEpisods(){
//        String actualText = episodesTab.getText();
//        return actualText;
//    }
//    public void clickOnschedule(){
//        scheduleTab.click();
//    }
//    public String clickSchedule(){
//        String actualText = scheduleTab.getText();
//        return actualText;
//    }
//    public void clickOnNewsAndSports(){
//        newsAndSportsTab.click();
//    }
//    public String clickNewsAndSports(){
//        String actualText = newsAndSportsTab.getText();
//        return actualText;
//    }
//    public void clickOnShop(){
//        shopsTab.click();
//    }
//    public String clickShops(){
//        String actualText = shopsTab.getText();
//        return actualText;
//    }
//    public void clickOnApp(){
//        appTab.click();
//    }
//    public String clickApp(){
//        String actualText = appTab.getText();
//        return actualText;
//    }
//    public void clickOnLive(){
//        liveTab.click();
//    }
//    public String clickLive(){
//        String actualText = liveTab.getText();
//        return actualText;
//    }
//    public void clickOnSearch(){
//        searchTab.click();
//    }
//    public String clickSearch(){
//        String actualText = searchTab.getText();
//        return actualText;
//    }
//    public void clickOnSignup(){
//        signUPTab.click();
//    }
//    public String clickSignup(){
//        String actualText = signUPTab.getText();
//        return actualText;
//    }
}
