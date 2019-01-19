package Pages;
import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import report.TestLogger;

public class HoverOver extends CommonAPI {
    public void toysHoverOver() throws InterruptedException {
        TestLogger.log(getClass().getSimpleName() + ": " + convertToString(new Object() {}.getClass().getEnclosingMethod().getName()));
        Actions maker = new Actions(driver);
        WebElement toysHover = driver.findElement(By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[9]/a"));
        Thread.sleep(3000);
        maker.moveToElement(toysHover).build().perform();
        Thread.sleep(3000);
        System.out.println(toysHover.getText());
    }
}


