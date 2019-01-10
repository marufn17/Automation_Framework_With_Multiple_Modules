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
    @FindBy(how = How.CSS, xpath = "//main[@id=\'main\']/div[1]/div/div/section[1]/div/div[1]/h2")
    WebElement popularShowTitle;
    @FindBy(how = How.XPATH, xpath = "//main[@id=\'main\']/div[1]/div/div/section[2]/div/div[1]/h2")
    WebElement newepisodes;
    @FindBy(how = How.XPATH, xpath = "//main[@id=\'main\']/div[1]/div/div/section[3]/div/div[1]/h2")
    WebElement latestbar;
    @FindBy(how = How.XPATH, xpath = "//main[@id=\'main\']/div[1]/div/div/section[4]/div/div[1]/h2")
    WebElement fullseasons;
    @FindBy(how = How.XPATH, xpath = "//main[@id=\'main\']/div[1]/div/div/section[5]/div/div[1]/h2")
    WebElement trendingnow;
    @FindBy(how = How.XPATH, xpath = "//div[@id=\'app\']/div/header/div/div/nav/div/ul/li[2]/button/span")
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
    @FindBy(how = How.XPATH, xpath = "//div[@id=\'app\']/div/header/div/div/nav/div/ul/li[8]/a/span")
     WebElement liveTab;
    @FindBy(how = How.CSS, css = "#app > div > header > div > div > nav > div > ul > li.navigation__item.navigation__item--search > button")
    WebElement searchTab;
    @FindBy(how = How.XPATH, xpath = "//div[@id=\'app\']/div/header/div/div/nav/div/ul/li[10]/div/a/span")
    WebElement signUPTab;
    @FindBy(className = "search-input__input")
    WebElement searchPageHeader;
    @FindBy(css = "#main > div.responsive-app__wrapper > div > div > div > div > div.search-results__outer > div > div > section > div > div.section-heading > h2")
    WebElement searchHeader;
    @FindBy(css = "#main > div.responsive-app__wrapper > div > div > h1")
    WebElement episodesPageHeader;
    @FindBy(css = "#main > div.responsive-app__wrapper > div > div.page-title > h1")
    WebElement schedulePageheader;
    @FindBy(css = "#main > div.responsive-app__wrapper > div > div > h1")
    WebElement appPageHeader;
    @FindBy(css = "#main > div.responsive-app__wrapper > div > section > div.cpc-live-anvato-video-player__dialog > div > div:nth-child(2) > div > div.mvpd-dialog__title")
    WebElement liveLinkProvider;
    @FindBy(xpath = "//div[@id=\'app\']/div/header/div/div/nav/div/ul/li[5]/div")
    WebElement newsFrame;
    @FindBy(xpath = "//div[@id=\'app\']/div/header/div/div/nav/div/ul/li[2]/div")
    WebElement showsFrame;
    @FindBy(xpath = "//div[@id=\'app\']/div/header/div/div/nav/div/ul/li[2]/div/ul/li[13]/a")
    WebElement housetab;
    @FindBy(xpath = "//div[@id=\'app\']/div/header/div/div/nav/div/ul/li[2]/div/ul/li[1]/a")
    WebElement americagot;
    @FindBy(xpath = "//div[@id=\'app\']/div/header/div/div/nav/div/ul/li[2]/div/ul/li[2]/a")
    WebElement blacklist;
    @FindBy(xpath = "//div[@id=\'app\']/div/header/div/div/nav/div/ul/li[2]/div/ul/li[4]/a")
    WebElement brooklyn;

    public String getHomePageTitle(){
        String title = driver.getTitle();
        return title;
    }
    public boolean nbcLogo(){
        boolean display = nbclogo.isDisplayed();
        return display;
    }
    public boolean logoEnabled(){
        boolean enabled = nbclogo.isEnabled ();
        return enabled;
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
    public List spellcheckHomePageExpected(){
        List<String> expected = new ArrayList<>();
        expected.add("POPULAR SHOWS");
        expected.add("NEW EPISODES");
        expected.add("LATEST CLIPS");
        expected.add("WATCH FULL SEASONS");
        expected.add("TRENDING NOW");
        expected.add("SHOWS");
        expected.add("EPISODES");
        expected.add("SCHEDULE");
        expected.add("NEWS & SPORTS");
        expected.add("SHOP");
        expected.add("APP");
        expected.add("LIVE");
        expected.add("SIGN UP");
        return expected;
    }
    public String checkSearchTab(){
        searchTab.click();
        String actual =searchHeader.getText();
        return actual;
    }
    public String checkEpisodesTab(){
        episodesTab.click();
        String text = episodesPageHeader.getText();
        return text;
    }
    public String checkScheduleTab(){
        scheduleTab.click();
        String text = schedulePageheader.getText();
        return text;
    }
    public String checkAppTab(){
        appTab.click();
        String text = appPageHeader.getText();
        return text;
    }
    public String checkLive(){
        liveTab.click();
        String text = liveLinkProvider.getText();
        return text;
    }
    public String checkShopTab() throws InterruptedException {
        shopsTab.click();
        Thread.sleep(1000);
        String url = driver.getCurrentUrl();
        return url;
    }
    public boolean newsFrame(){
        newsAndSportsTab.click();
        boolean isFrameEnabled = newsFrame.isDisplayed();
        return isFrameEnabled;
    }
    public boolean showsFrame(){
        showstab.click();
        boolean isFrameEnabled = showsFrame.isDisplayed ();
        return isFrameEnabled;
    }
    public List showFrameItems(){
        showstab.click ();
        List<WebElement> list = new ArrayList<> ();
        list.add (housetab);
        list.add (americagot);
        list.add (blacklist);
        list.add (brooklyn);
        List<String> items = new ArrayList<>();
        for (int i =0; i<list.size(); i++){
            items.add(list.get(i).getText());
            System.out.println(list.get(i).getText());
        }
        return items;
    }
    public List expectedFrameItems(){
        List<String> expected = new ArrayList<>();
        expected.add("Late Night with Seth Meyers");
        expected.add("America's Got Talent");
        expected.add("The Blacklist");
        expected.add("Brooklyn Nine-Nine");
        return expected;
    }
    public boolean houseShow(){
        boolean enabled = housetab.isEnabled ();
        return enabled;
    }
    public boolean agtShow(){
        boolean enabled = americagot.isEnabled ();
        return enabled;
    }
    public boolean blacklistShow(){
        boolean enabled = blacklist.isEnabled ();
        return enabled;
    }
    public boolean brooklynShow(){
        boolean enabled = brooklyn.isEnabled ();
        return enabled;
    }
    public void clickOnShows(){showstab.click();}
    public void clickOnSearch() {
        searchTab.click();
    }
    public void clickOnEpisodes(){
        episodesTab.click();
    }
    public void clickOnSchedule(){
        scheduleTab.click();
    }
    public void clickOnApp(){
        appTab.click();
    }

}
