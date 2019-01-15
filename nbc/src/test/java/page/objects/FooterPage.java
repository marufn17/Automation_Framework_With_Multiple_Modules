package page.objects;

import application.page.base.ApplicationPageBase;
import application.page.base.XlsDataReader;
import application.page.base.XlsxDataReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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
    @FindBy(css = "[href='https://www.nbc.com/exclusives/pages/casting']")
    WebElement casting;
    @FindBy(css = "[href='https://www.nbc.com/global/pages/tv-ratings']")
    WebElement parentalRating;
    @FindBy(css = "[href='/general/pages/accessibility']")
    WebElement Accessibilty;
    @FindBy(css = "[href='https://www.nbc.com/contact/general']")
    WebElement contactUs;
    @FindBy(css = "[href='https://www.nbc.com/tickets/pages/tickets-and-nbc-studio-tour']")
    WebElement ticketAndNbc;
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
    @FindBy(name = "facebook")
    WebElement fbicon;
    @FindBy(name = "twitter")
    WebElement twittericon;
    @FindBy(name = "tumblr")
    WebElement tumblricon;
    @FindBy(name = "pinterest")
    WebElement pinicon;
    @FindBy(css = ".googleplus")
    WebElement gplusicon;
    @FindBy(name = "youtube")
    WebElement ytubeicon;

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
        webElements.add(contactUs);
        webElements.add(parentalRating);
        webElements.add(ticketAndNbc);
        webElements.add(Accessibilty);
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
        System.out.println(list);
        return list;
    }
    XlsxDataReader xlxData = new XlsxDataReader("../nbc/testData/FooterLinkName.xlsx");
    public List expectedWebElementXlsx(){
        int rowcount = xlxData.getRowCount("sheet1");
        List<String> expect = new ArrayList<>();
        for(int i = 1; i < rowcount; i++){
            expect.add(xlxData.getData(0,i,0));
            System.out.println(xlxData.getData(0,i,0));
        }
        System.out.println(expect);
        return expect;
    }
    XlsDataReader xlData = new XlsDataReader("../nbc/testData/FooterLinkName.xls");
    public List expectedWebElementXls(){
        int rowcount = xlData.getRowCount("sheet1");
        List<String> expect = new ArrayList<>();
        for(int i = 1; i < rowcount; i++){
            expect.add(xlData.getData(0,i,0));
            System.out.println(xlData.getData(0,i,0));
        }
        System.out.println(expect);
        return expect;
    }
    public String fbIcon() throws InterruptedException {//new tab handling
        fbicon.click();
        Thread.sleep(3000);
        System.out.println (driver.getTitle ());

        for(String fbtab:driver.getWindowHandles ()){
            driver.switchTo ().window (fbtab);
        }
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl();
        System.out.println(url);
        return url;
    }
    public String twitterIcon() throws InterruptedException {
        twittericon.click ();
        Thread.sleep (3000);
        System.out.println (driver.getTitle ());
        for(String twtTab:driver.getWindowHandles ()){
            driver.switchTo ().window (twtTab);
        }
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
    public String tumbIcon() throws InterruptedException {
        tumblricon.click ();
        Thread.sleep (3000);
        System.out.println (driver.getTitle ());
        for(String tumbTab:driver.getWindowHandles ()){
            driver.switchTo ().window (tumbTab);
        }
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
    public String pinIcon() throws InterruptedException {
        pinicon.click ();
        Thread.sleep (3000);
        System.out.println (driver.getTitle ());
        for(String pinTab:driver.getWindowHandles ()){
            driver.switchTo ().window (pinTab);
        }
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
    public String gplusIcon() throws InterruptedException {
        gplusicon.click ();
        Thread.sleep (3000);
        System.out.println (driver.getTitle ());
        for(String gpTab:driver.getWindowHandles ()){
            driver.switchTo ().window (gpTab);
        }
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
    public String yTubelusIcon() throws InterruptedException {
        ytubeicon.click ();
        Thread.sleep (3000);
        System.out.println (driver.getTitle ());
        for(String ytTab:driver.getWindowHandles ()){
            driver.switchTo ().window (ytTab);
        }
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
    public String nbcLink() throws InterruptedException {
        fullEpisodesApp.click ();
        Thread.sleep (1000);
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
    public String faqLink() throws InterruptedException {
        faq.click ();
        Thread.sleep (1000);
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
    public String castingLink() throws InterruptedException {
        casting.click ();
        Thread.sleep (1000);
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
    public String parentalLink() throws InterruptedException {
        parentalRating.click ();
        Thread.sleep (1000);
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
    public String ticketAndNbc() throws InterruptedException {
        ticketAndNbc.click ();
        Thread.sleep (1000);
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
    public String accessibilityLink() throws InterruptedException {
        Accessibilty.click ();
        Thread.sleep (1000);
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
    public String contactUsLink() throws InterruptedException {
        contactUs.click ();
        Thread.sleep (1000);
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
    public String corporateInfoLink() throws InterruptedException {
        corporateInfo.click ();
        Thread.sleep (1000);
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
    public String jobsLink() throws InterruptedException {
        jobs.click ();
        Thread.sleep (1000);
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
    public String privacyLink() throws InterruptedException {
        privacy.click ();
        Thread.sleep (1000);
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
    public String termLink() throws InterruptedException {
        terms.click ();
        Thread.sleep (1000);
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
    public String advertiseLink() throws InterruptedException {
        advertise.click ();
        Thread.sleep (1000);
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
    public String viewerLink() throws InterruptedException {
        viewerPanel.click ();
        Thread.sleep (1000);
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
    public String closedLink() throws InterruptedException {
        closedCaptioning.click ();
        Thread.sleep (1000);
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
    public String technicalLink() throws InterruptedException {
        technicalSupport.click ();
        Thread.sleep (1000);
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
    public String videoLink() throws InterruptedException {
        videoViewing.click ();
        Thread.sleep (1000);
        System.out.println (driver.getTitle ());
        String url = driver.getCurrentUrl ();
        return url;
    }
}
