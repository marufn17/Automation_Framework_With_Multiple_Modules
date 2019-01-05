package Test;

import Pages.HomePage;
import base.CommonAPI;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHomePage extends CommonAPI {
    HomePage pageobject;

    @BeforeMethod
    public void init() {
        pageobject = new HomePage();
    }

    @Test(priority = 2)
    public void searchTest() {
        pageobject.searchbox();
    }

    @Test(priority = 1)

    public void searchitem() {

        pageobject.setSearchItem();


    }

    @Test(priority = 3)
    public void signinpage() {
        pageobject.createacct();

    }

    @Test(priority = 4)

    public void motortab() {

        pageobject.motortab();
    }

    @Test(priority = 5)

    public void dailydealstab() {
        pageobject.dailydealstab();

    }

    @Test(priority = 6)

    public void fashiontab() {

        pageobject.fashiontab();
    }

    @Test(priority = 7)

    public void electronicstab() {

        pageobject.electronicstab();
    }
}

