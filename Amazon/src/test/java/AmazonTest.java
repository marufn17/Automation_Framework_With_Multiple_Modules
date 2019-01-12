import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AmazonTest extends AmazonAutomation {
    String appUrl="https://www.amazon.com";
    @Test
    public void test1(){
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Books");
    }
    @Test
    public void test2(){
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iPhone");
    }

    @Test
    // Go back to Home Page
    public void navigateBack(){
        driver.navigate().back();
    }
    @Test
    // Go forward to Registration page
    public void navigateForward(){
        driver.navigate().forward();
    }
    @Test
    // Go back to Home page
    public void homePage(){
        driver.navigate().to(appUrl);
    }

    @Test
    // Refresh browser
    public void refresh(){
        driver.navigate().refresh();

    }


}
