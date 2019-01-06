package Pages;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends CommonAPI {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "gh-ac")
    WebElement searchbox;

    public void searchbox() {
        searchbox.sendKeys("Books", Keys.ENTER);
    }

    @FindBy(xpath = "//a[contains(text(),'register')]")

    WebElement createacct;

    public void createacct() {

        createacct.click();
    }

    @FindBy(id = "gh-ac")

    WebElement searchItem;

    public void setSearchItem() {
        searchItem.sendKeys("Toys");
        searchItem.click();

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

    public void fashiontab() {

        fashion.click();

    }

    @FindBy(linkText = "Electronics")


    WebElement electronics;

    public void electronicstab() {

        electronics.click();

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
}











