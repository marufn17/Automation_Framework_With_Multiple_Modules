package tests;

import base.CommonAPI;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class HomePageTest extends CommonAPI {

     HomePage homePage;


   @BeforeMethod
    public void init(){
        homePage = new HomePage();}
    @Test(priority = 1)
    public void Flightsearchtest(){
        homePage.setFlighttabsearch();

    }
}
