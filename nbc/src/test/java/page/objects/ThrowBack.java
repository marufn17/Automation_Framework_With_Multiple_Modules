package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class ThrowBack extends ApplicationPageBase {
    @FindBy(css = "#app > div > header > div > div > nav > div > ul > li.navigation__item.navigation__item--shows.navigation__item--group.navigation__item--expanded > div > ul > li.navigation__item__more > a")
    WebElement allshows;
    @FindBy(xpath = "//main[@id=\'main\']/div[1]/div/section/section/div[1]/div/ul/li[4]/a")
    WebElement throwbackTab;
    @FindBy(xpath = "//main[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[4]/section/div/div[2]/a[1]/article/div[2]/div[1]")
    WebElement thirtyRock;
    @FindBy(xpath = "//main[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[4]/section/div/div[2]/a[2]/article/div[2]/div[1]")
    WebElement amazing;
    @FindBy(xpath = "//main[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[4]/section/div/div[2]/a[3]/article/div[2]/div[1]")
    WebElement average;
    @FindBy(xpath = "//main[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[4]/section/div/div[2]/a[4]/article/div[2]/div[1]")
    WebElement battlestar;
    @FindBy(xpath = "//main[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[4]/section/div/div[2]/a[5]/article/div[2]/div[1]")
    WebElement bionic;
    @FindBy(xpath = "//main[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[4]/section/div/div[2]/a[6]/article/div[2]/div[1]")
    WebElement black;

    public List throwbackList(){
        allshows.click ();
        throwbackTab.click ();
        List<WebElement> webElements = new ArrayList<> ();
        webElements.add (thirtyRock);
        webElements.add (amazing);
        webElements.add (average);
        webElements.add (battlestar);
        webElements.add (bionic);
        webElements.add (black);
        List<String> text = new ArrayList<> ();
        for (int i =0; i<webElements.size ();i++){
            text.add (webElements.get (i).getText ());
            System.out.println (webElements.get (i).getText ());
        }
        return text;
    }
    public List expectedthrowbackShows(){
        List<String> expectedShowsName = new ArrayList<> ();
        expectedShowsName.add ("30 Rock");
        expectedShowsName.add ("Amazing Stories");
        expectedShowsName.add ("Average Joe");
        expectedShowsName.add ("Battlestar Galactica");
        expectedShowsName.add ("The Bionic Woman");
        expectedShowsName.add ("The Black Donnellys");
        return expectedShowsName;
    }
}
