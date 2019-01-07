package page.objects;

import application.page.base.ApplicationPageBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import java.lang.invoke.CallSite;
import java.util.ArrayList;
import java.util.List;

public class FooterPage extends ApplicationPageBase {

    @FindBy(how = How.CSS, css = "#main > footer > div.footer__logo > a")
    WebElement footerLogo;
    @FindBy(css = "#main > footer > section > div > div.footer__left > div > h2")
    WebElement shareMsg;
    @FindBy(css = "#main > footer > section > div > div.footer__right > div > h2")
    WebElement quickLinkMsg;
    @FindBy(css = "#main > footer > section > div > div.footer__right > div > ul > li:nth-child(1) > a")
    WebElement fullEpisodesApp;
    @FindBy(css = "#main > footer > section > div > div.footer__right > div > ul > li:nth-child(2) > a")
    WebElement faq;
    @FindBy(css = "#main > footer > section > div > div.footer__right > div > ul > li:nth-child(3) > a")
    WebElement casting;
    @FindBy(css = "#main > footer > section > div > div.footer__right > div > ul > li:nth-child(4) > a")
    WebElement nbcStore;
    @FindBy(css = "#main > footer > section > div > div.footer__right > div > ul > li:nth-child(5) > a")
    WebElement parentalRating;
    @FindBy(css = "#main > footer > section > div > div.footer__right > div > ul > li:nth-child(6) > a")
    WebElement Accessibilty;
    @FindBy(css = "#main > footer > div.footer__legal > div > ul > li:nth-child(1) > a")
    WebElement contactUs;
    @FindBy(css = "#main > footer > div.footer__legal > div > ul > li:nth-child(2) > a")
    WebElement corporateInfo;
    @FindBy(css = "#main > footer > div.footer__legal > div > ul > li:nth-child(3) > a")
    WebElement jobs;
    @FindBy(css = "#main > footer > div.footer__legal > div > ul > li:nth-child(4) > a")
    WebElement privacy;
    @FindBy(css = "#main > footer > div.footer__legal > div > ul > li:nth-child(5) > a")
    WebElement terms;
    @FindBy(css = "#main > footer > div.footer__legal > div > ul > li:nth-child(6) > a")
    WebElement advertise;
    @FindBy(css = "#main > footer > div.footer__legal > div > ul > li:nth-child(7) > a")
    WebElement viewerPanel;
    @FindBy(css = "#main > footer > div.footer__legal > div > ul > li:nth-child(8) > a")
    WebElement closedCaptioning;
    @FindBy(css = "#main > footer > div.footer__legal > div > ul > li:nth-child(9) > a")
    WebElement technicalSupport;
    @FindBy(css = "#main > footer > div.footer__legal > div > ul > li:nth-child(10) > a")
    WebElement videoViewing;


    public boolean isFooterLogoDisplayd(){
        boolean logo = footerLogo.isDisplayed();
        return logo;
    }

    public List webElementList(){
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(shareMsg);
        webElements.add(quickLinkMsg);
        webElements.add(fullEpisodesApp);
        webElements.add(faq);
        webElements.add(casting);
        webElements.add(nbcStore);
        webElements.add(parentalRating);
        webElements.add(Accessibilty);
        webElements.add(contactUs);
        webElements.add(corporateInfo);
        webElements.add(jobs);
        webElements.add(privacy);
        webElements.add(terms);
        webElements.add(advertise);
        webElements.add(viewerPanel);
        webElements.add(closedCaptioning);
        webElements.add(technicalSupport);
        webElements.add(videoViewing);
        List<String> list = new ArrayList<>();
        for (int i = 0; i<webElements.size();i++){
            list.add(webElements.get(i).getText());
        }
        return list;
    }
}
