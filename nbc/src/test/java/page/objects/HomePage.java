package page.objects;
import application.page.base.ApplicationPageBase;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import report.TestLogger;
import java.util.ArrayList;
import java.util.List;

public class HomePage extends ApplicationPageBase {

    @FindBy(how = How.CSS, css = ".navigation__logo")
    WebElement nbclogo;
    @FindBy(how = How.CSS, css = ".slideshow__container")
    WebElement slideshowContainer;
    @FindBy(how = How.CSS, css = ".home-page__sections .shelf:nth-child(2) .section-heading__title")
    WebElement popularShowTitle;
    @FindBy(how = How.CSS, css = ".home-page__sections .shelf:nth-child(3) .section-heading__title")
    WebElement newepisodes;
    @FindBy(how = How.CSS, css = ".home-page__sections .shelf:nth-child(4) .section-heading__title")
    WebElement latestbar;
    @FindBy(how = How.CSS, css = ".home-page__sections .shelf:nth-child(5) .section-heading__title")
    WebElement fullseasons;
    @FindBy(how = How.CSS, css = ".home-page__sections .shelf:nth-child(6) .section-heading__title")
    WebElement trendingnow;
    @FindBy(how = How.CSS, css = ".navigation__item--shows .navigation__item__title")
    WebElement showstab;
    @FindBy(how = How.CSS, css = ".navigation__list .navigation__item:nth-of-type(3) .navigation__item__title")
    WebElement episodesTab;
    @FindBy(how = How.CSS, css = ".navigation__list .navigation__item:nth-of-type(4) .navigation__item__title")
    WebElement scheduleTab;
    @FindBy(how = How.CSS, css = ".navigation__list .navigation__item--group:nth-of-type(5) .navigation__item__title")
    WebElement newsAndSportsTab;
    @FindBy(how = How.CSS, css = ".navigation__list .navigation__item:nth-of-type(6) .navigation__item__title")
    WebElement shopsTab;
    @FindBy(how = How.CSS, css = ".navigation__list .navigation__item:nth-of-type(7) .navigation__item__title")
    WebElement appTab;
    @FindBy(how = How.CSS, css = ".navigation__item--live .navigation__item__title")
     WebElement liveTab;
    @FindBy(how = How.CSS, css = ".navigation__item--search [aria-label]")
    WebElement searchTab;
    @FindBy(how = How.CSS, css = ".navigation__item__link--sign-up span")
    public static WebElement signUPTab;
    @FindBy(css = "#main > div.responsive-app__wrapper > div > div > div > div > div.search-results__outer > div > div > section > div > div.section-heading > h2")
    WebElement searchHeader;
    @FindBy(css = ".page-title__title")
    WebElement episodesPageHeader;
    @FindBy(css = ".page-title__title")
    WebElement schedulePageheader;
    @FindBy(css = ".page-title__title")
    WebElement appPageHeader;
    @FindBy(css = ".mvpd-dialog__featured .mvpd-dialog__title")
    WebElement liveLinkProvider;
    @FindBy(css = ".navigation__item__list--articles")
    WebElement newsFrame;
    @FindBy(css = ".navigation__item__group")
    WebElement showsFrame;
    @FindBy(css = "[href='/house']")
    WebElement housetab;
    @FindBy(css = ".navigation__item__list [href='/americas-got-talent']")
    WebElement americagot;
    @FindBy(css = ".navigation__item__list [href='/the-blacklist']")
    WebElement blacklist;
    @FindBy(css = ".navigation__item__list [href='/brooklyn-nine-nine']")
    WebElement brooklyn;
    @FindBy(css = "[href='/shows/current']")
    WebElement allTabs;

    public String getHomePageTitle(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        String title = driver.getTitle();
        return title;
    }
    public boolean nbcLogo(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean display = nbclogo.isDisplayed();
        return display;
    }
    public boolean logoEnabled(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean enabled = nbclogo.isEnabled ();
        return enabled;
    }
    public boolean SlideshowContainerDisplay(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
       boolean display = slideshowContainer.isDisplayed();
       return display;
    }
    public List spellCheckHomePage(){//to check spelling of all the tab
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        searchTab.click();
        String actual =searchHeader.getText();
        return actual;
    }
    public String checkEpisodesTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        episodesTab.click();
        String text = episodesPageHeader.getText();
        return text;
    }
    public String checkScheduleTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        scheduleTab.click();
        String text = schedulePageheader.getText();
        return text;
    }
    public String checkAppTab(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        appTab.click();
        String text = appPageHeader.getText();
        return text;
    }
    public String checkLive(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        liveTab.click();
        String text = liveLinkProvider.getText();
        return text;
    }
    public String checkShopTab() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        shopsTab.click();
        Thread.sleep(1000);
        String url = driver.getCurrentUrl();
        return url;
    }
    public boolean newsFrame(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        newsAndSportsTab.click();
        boolean isFrameEnabled = newsFrame.isDisplayed();
        return isFrameEnabled;
    }
    public boolean showsFrame(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        showstab.click();
        boolean isFrameEnabled = showsFrame.isDisplayed ();
        return isFrameEnabled;
    }
    public List showFrameItems(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        List<String> expected = new ArrayList<>();
        expected.add("House");
        expected.add("America's Got Talent");
        expected.add("The Blacklist");
        expected.add("Brooklyn Nine-Nine");
        return expected;
    }
    public boolean houseShow(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean enabled = housetab.isEnabled ();
        return enabled;
    }
    public boolean agtShow(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean enabled = americagot.isEnabled ();
        return enabled;
    }
    public boolean blacklistShow(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean enabled = blacklist.isEnabled ();
        return enabled;
    }
    public boolean brooklynShow(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        boolean enabled = brooklyn.isEnabled ();
        return enabled;
    }
    public void clickOnShows(){
        showstab.click();
        allTabs.click();
    }
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
    public void clickOnSignUp(){signUPTab.click();}
}
