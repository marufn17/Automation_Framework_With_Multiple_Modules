package Test;

import Pages.HoverOver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import report.TestLogger;


public class testHoverOver extends HoverOver {

    HoverOver hoverOver;

    @BeforeMethod
    public void initHoverOverClass() {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hoverOver = PageFactory.initElements(driver, HoverOver.class);
    }


    @Test(priority = 1)
    public void testToysHoverOver() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hoverOver.toysHoverOver();
    }

    @Test(priority = 2)
    public void testMotorsHoverOver() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hoverOver.motorsHoverOver();
    }

    @Test(priority = 3)
    public void testMusicHoverOver() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        hoverOver.musicHoverOver();
    }
}




