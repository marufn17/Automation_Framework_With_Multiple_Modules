package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class AllShows extends ApplicationPageBase {
    @FindBy(xpath = "//a[@id=\'app\']/div/header/div/div/nav/div/ul/li[2]/div/ul/li[27]/a")
    WebElement allShows;
    @FindBy(xpath = "//a[@id=\'main\']/div[1]/div/section/section/div[1]/div/ul/li[1]/a")
    WebElement all;
    @FindBy(xpath = "//h2[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[1]/section/div/div[1]/h2")
    WebElement allHeader;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[1]/section/div/div[2]/a[2]/article/div[2]/div[1]")
    WebElement apBio;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[1]/section/div/div[2]/a[3]/article/div[2]/div[1]")
    WebElement abba;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[1]/section/div/div[2]/a[4]/article/div[2]/div[1]")
    WebElement abby;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[1]/section/div/div[2]/a[5]/article/div[2]/div[1]")
    WebElement access;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[1]/section/div/div[2]/a[6]/article/div[2]/div[1]")
    WebElement amazingStories;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[1]/section/div/div[2]/a[7]/article/div[2]/div[1]")
    WebElement camericagot;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[1]/section/div/div[2]/a[8]/article/div[2]/div[1]")
    WebElement cAmricaNinja;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[1]/section/div/div[2]/a[11]/article/div[2]/div[1]")
    WebElement cbetter;
    @FindBy(xpath = "//*[@id=\'main\']/div[1]/div/section/section/div[2]/div/div[1]/section/div/div[2]/a[14]/article/div[2]/div[1]")
    WebElement cTheblack;

    public String allShpows(){
        allShows.click();
        all.click();
        String text = allHeader.getText();
        return text;
    }
    public List list(){
        allShows.click();
        all.click();
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(apBio);
        webElements.add(abba);
        webElements.add(abby);
        webElements.add(access);
        webElements.add(amazingStories);
        webElements.add(camericagot);
        webElements.add(cAmricaNinja);
        webElements.add(cbetter);
        webElements.add(cTheblack);
        List<String > text = new ArrayList<>();
        for(int i = 0; i<webElements.size();i++){
            text.add(webElements.get(i).getText());
            System.out.println(webElements.get(i).getText());
        }
        return text;
    }
    public List expectedAllShows(){
        List<String> expectedShowsName = new ArrayList<>();
        expectedShowsName.add("A.P. Bio");
        expectedShowsName.add("ABBA: Thank You for the Music, An All-Star Tribute");
        expectedShowsName.add("Abby's");
        expectedShowsName.add("Access");
        expectedShowsName.add("Amazing Stories");
        expectedShowsName.add("America's Got Talent");
        expectedShowsName.add("American Ninja Warrior");
        expectedShowsName.add("Better Late Than Never");
        expectedShowsName.add("The Blacklist");
        return expectedShowsName;
    }
}
