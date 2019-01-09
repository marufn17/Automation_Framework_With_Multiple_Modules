package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class CurrentShows extends ApplicationPageBase {
    @FindBy(xpath = "//*[@id=\'app\']/div/header/div/div/nav/div/ul/li[2]/div/ul/li[30]/a")
    WebElement allshows;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[2]/section/div/div[2]/a[1]/article/div[2]/div[1]")
    WebElement capbio;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[2]/section/div/div[2]/a[2]/article/div[2]/div[1]")
    WebElement caccess;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[2]/section/div/div[2]/a[3]/article/div[2]/div[1]")
    WebElement camericagot;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[2]/section/div/div[2]/a[4]/article/div[2]/div[1]")
    WebElement cAmricaNinja;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[2]/section/div/div[2]/a[5]/article/div[2]/div[1]")
    WebElement cbetter;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[2]/section/div/div[2]/a[6]/article/div[2]/div[1]")
    WebElement cTheblack;

    public List currentList(){
        allshows.click ();
        List<WebElement> webElements = new ArrayList<> ();
        webElements.add (capbio);
        webElements.add (caccess);
        webElements.add (camericagot);
        webElements.add (cAmricaNinja);
        webElements.add (cbetter);
        webElements.add (cTheblack);
        List<String> text = new ArrayList<> ();
        for (int i =0; i<webElements.size ();i++){
            text.add (webElements.get (i).getText ());
            System.out.println (webElements.get (i).getText ());
        }
        return text;
    }
    public List expectedCurrentShows(){
        List<String> expectedShowsName = new ArrayList<> ();
        expectedShowsName.add ("A.P. Bio");
        expectedShowsName.add ("Access");
        expectedShowsName.add ("America's Got Talent");
        expectedShowsName.add ("American Ninja Warrior");
        expectedShowsName.add ("Better Late Than Never");
        expectedShowsName.add ("The Blacklist");
        return expectedShowsName;
    }
}
