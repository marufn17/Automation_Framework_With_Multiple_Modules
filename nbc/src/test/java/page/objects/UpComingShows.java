package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class UpComingShows extends ApplicationPageBase {
    @FindBy(xpath = "//*[@id=\'app\']/div/header/div/div/nav/div/ul/li[2]/div/ul/li[30]/a")
    WebElement allshows;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[1]/div/ul/li[3]/a")
    WebElement upcomingTab;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[3]/section/div/div[2]/a[1]/article/div[2]/div[1]")
    WebElement abba;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[3]/section/div/div[2]/a[2]/article/div[2]/div[1]")
    WebElement abbys;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[3]/section/div/div[2]/a[3]/article/div[2]/div[1]")
    WebElement elvis;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[3]/section/div/div[2]/a[4]/article/div[2]/div[1]")
    WebElement enemy;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[3]/section/div/div[2]/a[5]/article/div[2]/div[1]")
    WebElement hair;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[3]/section/div/div[2]/a[6]/article/div[2]/div[1]")
    WebElement inbetween;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[3]/section/div/div[2]/a[7]/article/div[2]/div[1]")
    WebElement village;
    public List upcomingList(){
        allshows.click ();
        upcomingTab.click ();
        List<WebElement> webElements = new ArrayList<> ();
        webElements.add (abba);
        webElements.add (abbys);
        webElements.add (elvis);
        webElements.add (enemy);
        webElements.add (hair);
        webElements.add (inbetween);
        webElements.add (village);
        List<String> text = new ArrayList<> ();
        for (int i =0; i<webElements.size ();i++){
            text.add (webElements.get (i).getText ());
            System.out.println (webElements.get (i).getText ());
        }
        return text;
    }
    public List expectedCurrentShows(){
        List<String> expectedShowsName = new ArrayList<> ();
        expectedShowsName.add ("ABBA: Thank You for the Music, An All-Star Tribute");
        expectedShowsName.add ("Abby's");
        expectedShowsName.add ("Elvis All-Star Tribute");
        expectedShowsName.add ("The Enemy Within");
        expectedShowsName.add ("Hair Live!");
        expectedShowsName.add ("The InBetween");
        expectedShowsName.add ("The Village");
        return expectedShowsName;
    }
}
