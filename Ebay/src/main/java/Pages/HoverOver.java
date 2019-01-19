package Pages;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import report.TestLogger;

public class HoverOver extends CommonAPI {
    public void toysHoverOver() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions maker = new Actions(driver);
        WebElement toysHover = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[9]/a"));
        Thread.sleep(3000);
        maker.moveToElement(toysHover).build().perform();
        Thread.sleep(3000);
        System.out.println(toysHover.getText());
    }

    public void motorsHoverOver() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions maker = new Actions(driver);
        WebElement motorsHover = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a"));
        Thread.sleep(3000);
        maker.moveToElement(motorsHover).build().perform();
        Thread.sleep(3000);
        System.out.println(motorsHover.getText());
    }

    public void musicHoverOver() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {
        }.getClass().getEnclosingMethod().getName()));
        Actions maker = new Actions(driver);
        WebElement musicHover = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[11]/a"));
        Thread.sleep(3000);
        maker.moveToElement(musicHover).build().perform();
        Thread.sleep(3000);
        System.out.println(musicHover.getText());
    }
}




