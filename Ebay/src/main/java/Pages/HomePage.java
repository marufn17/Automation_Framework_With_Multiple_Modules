package Pages;

import base.CommonAPI;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.security.SecureRandom;

public class HomePage extends CommonAPI {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "gh-ac")
    WebElement searchbox;
    @FindBy(css = "#srp-river-results-listing1 > div > div.s-item__info.clearfix > a > h3")
    WebElement booksitems;

    public String searchbox() {
        searchbox.sendKeys("Books", Keys.ENTER);
        String books = booksitems.getText();
        return books;
    }

    @FindBy(xpath = "//a[contains(text(),'register')]")
    WebElement createacct;
    @FindBy(xpath = "//*[@id=\"sgnInPnl\"]/div[1]/span[1]")
    WebElement createAcctTab;
    public String createaccttab(){
        createacct.click();
        String cract = createAcctTab.getText();
        System.out.println(cract);
        return cract;


    }

    @FindBy(id = "gh-ac")
    WebElement searchItem;
    @FindBy(xpath = "//*[@id=\'srp-river-results-listing1\']/div/div[2]/a/h3")
    WebElement toysItem;

    public String setSearchItem() {
        searchItem.sendKeys("Toys", Keys.ENTER);
        String item = toysItem.getText();
        return item;
    }

    @FindBy(linkText = "Motors")
    WebElement searchMotortab;

    public void motortab() {
        searchMotortab.click();
    }

    @FindBy(xpath = "//a[contains(text(),'register')]")

    WebElement dailydeals;

    public void dailydealstab() {
        dailydeals.click();
    }

    @FindBy(linkText = "Fashion")
    WebElement fashion;
    @FindBy(css = "#w5-bModCarousel-xCarousel-x-carousel-items > ul > li:nth-child(1) > div > a > div.b-event__footer > h3")
    WebElement fashionex;
    public String fashiontab(){
     fashion.click();
    String fi = fashionex.getText();
    System.out.println(fi);
    return fi;
    }

    @FindBy(linkText = "Electronics")
    WebElement electronics;
    @FindBy(css = "body > div.pagecontainer.srp-main--isLarge > div.pagecontainer__top > h1 > span")
    WebElement electornex;
    public String electronic() {
    electronics.click();
     String el = electornex.getText();
     return el;
    }

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a")

    WebElement collectiblesart;

    public void collectiblesarttab() {
        collectiblesart.click();
    }

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a")

    WebElement homeandgarden;

    public void homegardentab() {
        homeandgarden.click();
    }

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[7]/a")

    WebElement sportinggoods;

    public void sportinggoodsTest() {
        sportinggoods.click();
    }

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[9]/a")
    WebElement toy;

    public void toytab() {
        toy.click();
    }
    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[14]/span")
    WebElement more;

    public void moresearch() {
        more.click();
    }

    @FindBy(xpath = "//*[@id=\"gh-p-4\"]/a")
    WebElement giftcards;

    public void giftcardsearch() {
        giftcards.click();
    }

    @FindBy(xpath = "//*[@id=\"gh-p-3\"]/a")
    WebElement helpandcontact;

    public void helpcontactsearch() {
        helpandcontact.click();
    }

    @FindBy(xpath = "//*[@id=\"gh-p-2\"]/a")
    WebElement sell;

    public void sellSearch() {
        sell.click();
    }

    @FindBy(xpath = "//*[@id=\"gh-eb-My\"]/div/a[1]")
    WebElement myebay;

    public void myebaytab() {
        myebay.click();
    }

    @FindBy(css = "#gh-cart-i")
    WebElement shoppingcart;

    public void shoppingcartsearch() {
        shoppingcart.click();
    }

    @FindBy(xpath = "//*[@id=\"mainContent\"]/div[1]/ul/li[10]/a")
    WebElement businessandindustril;

    public void businesssearch() {
        businessandindustril.click();
    }

    @FindBy(css = "#gh-shop-a")
    WebElement shopbycategory;

    public void shopbycategorysearch() {
        shopbycategory.click();
    }

    @FindBy(css = "#gh-cat")
    WebElement allcategory;

    public void allcategorysearch() {
        allcategory.click();
    }

    @FindBy(xpath = "//*[@id=\"gh-as-a\"]")
    WebElement advance;

    public void advancesearch() {
        advance.click();
    }

    @FindBy(css = "#gh-Alerts-i")
    WebElement bellbutton;

    public void bellbuttonsearch() {
        bellbutton.click();
    }

    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[1]/ul/li[1]/h3/a")
    WebElement buy;

    public void buysearch() {
        buy.click();
    }

    @FindBy(css = "#gf-BIG > table > tbody > tr > td:nth-child(2) > ul > li:nth-child(1) > h3 > a")
    WebElement selltab;

    public void sellsearch() {
        sell.click();
    }

    @FindBy(xpath = "//*[@id=\"gf-BIG\"]/table/tbody/tr/td[5]/ul/li[6]/h3/a")
    WebElement community;

    public void communitysearch() {
        community.click();
    }

    @FindBy(xpath = "//*[@id=\"gf-t-box\"]/table/tbody/tr[2]/td[1]/a[2]")
    WebElement useragreement;

    public void useragreementsearch() {
        useragreement.click();
    }
    @FindBy(xpath = "//*[@id=\"gh-logo\"]")

    static WebElement homepagelogo;

    public static boolean homepagelogotest() {
        boolean logo = homepagelogo.isDisplayed();
        return logo;
    }
}












