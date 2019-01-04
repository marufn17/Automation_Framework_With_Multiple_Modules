package Test;

import Pages.Pages;
import base.CommonAPI;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestS extends CommonAPI {
    Pages pageobject;
    @BeforeMethod
    public void init(){
        pageobject = new Pages();}
        @Test(priority = 1)
        public void SearchTest(){
            pageobject.searchbox();
        }



}
