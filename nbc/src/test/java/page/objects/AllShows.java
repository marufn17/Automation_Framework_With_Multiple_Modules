package page.objects;

import application.page.base.ApplicationPageBase;
import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import report.TestLogger;
import java.util.ArrayList;
import java.util.List;

public class AllShows extends ApplicationPageBase {
    @FindBy(xpath = "//div[@id='app']/div/header/div/div/nav/div/ul/li[2]/div/ul/li[27]/a")//*[@id="app"]/div/header/div/div/nav/div/ul/li[2]/div/ul/li[27]/a
    WebElement allShows;
    @FindBy(xpath = "//main[@id='main']/div[1]/div/section/section/div[1]/div/ul/li[1]/a")
    WebElement all;
    @FindBy(xpath = "//main[@id='main']/div[1]/div/section/section/div[2]/div/div[1]/section/div/div[1]/h2")
    WebElement allHeader;
    @FindBy(xpath = "//main[@id='main']/div[1]/div/section/section/div[2]/div/div[1]/section/div/div[2]/a[2]/article/div[2]/div[1]")
    WebElement apBio;
    @FindBy(xpath = "//main[@id='main']/div[1]/div/section/section/div[2]/div/div[1]/section/div/div[2]/a[3]/article/div[2]/div[1]")
    WebElement abba;
    @FindBy(xpath = "//main[@id='main']/div[1]/div/section/section/div[2]/div/div[1]/section/div/div[2]/a[4]/article/div[2]/div[1]")
    WebElement abby;
    @FindBy(xpath = "//main[@id='main']/div[1]/div/section/section/div[2]/div/div[1]/section/div/div[2]/a[5]/article/div[2]/div[1]")
    WebElement access;
    @FindBy(xpath = "//main[@id='main']/div[1]/div/section/section/div[2]/div/div[1]/section/div/div[2]/a[6]/article/div[2]/div[1]")
    WebElement amazingStories;
    @FindBy(xpath = "//main[@id='main']/div[1]/div/section/section/div[2]/div/div[1]/section/div/div[2]/a[7]/article/div[2]/div[1]")
    WebElement camericagot;
    @FindBy(xpath = "//main[@id='main']/div[1]/div/section/section/div[2]/div/div[1]/section/div/div[2]/a[8]/article/div[2]/div[1]")
    WebElement cAmricaNinja;
    @FindBy(xpath = "//main[@id='main']/div[1]/div/section/section/div[2]/div/div[1]/section/div/div[2]/a[11]/article/div[2]/div[1]")
    WebElement cbetter;
    @FindBy(xpath = "//main[@id='main']/div[1]/div/section/section/div[2]/div/div[1]/section/div/div[2]/a[14]/article/div[2]/div[1]")
    WebElement cTheblack;

    public String allShows(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
        all.click();
        String text = allHeader.getText();
        return text;
    }
    public List list(){
        TestLogger.log(getClass().getSimpleName() + ": " + CommonAPI.convertToString(new Object(){}.getClass().getEnclosingMethod().getName()));
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
}//347-503-9266
