package page.objects;

import application.page.base.ApplicationPageBase;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import report.TestLogger;

import java.util.ArrayList;
import java.util.List;

public class CurrentShows extends ApplicationPageBase {
    @FindBy(xpath = "//div[@id='app']/div/header/div/div/nav/div/ul/li[2]/div/ul/li[27]/a")
    WebElement allshows;
    @FindBy(xpath = "//main[@id='main']/div[1]/div/section/section/div[2]/div/div[2]/section/div/div[2]/a[1]/article/div[2]/div[1]")
    WebElement capbio;
    @FindBy(xpath = "//main[@id='main']/div[1]/div/section/section/div[2]/div/div[2]/section/div/div[2]/a[2]/article/div[2]/div[1]")
    WebElement caccess;
    @FindBy(xpath = "//main[@id='main']/div[1]/div/section/section/div[2]/div/div[2]/section/div/div[2]/a[3]/article/div[2]/div[1]")
    WebElement camericagot;
    @FindBy(xpath = "//main[@id='main']/div[1]/div/section/section/div[2]/div/div[2]/section/div/div[2]/a[4]/article/div[2]/div[1]")
    WebElement cAmricaNinja;
    @FindBy(xpath = "//main[@id='main']/div[1]/div/section/section/div[2]/div/div[2]/section/div/div[2]/a[5]/article/div[2]/div[1]")
    WebElement cbetter;
    @FindBy(xpath = "//main[@id='main']/div[1]/div/section/section/div[2]/div/div[2]/section/div/div[2]/a[6]/article/div[2]/div[1]")
    WebElement cTheblack;

    public List currentList(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
