import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AmazonTest extends AmazonAutomation {
    String appUrl="https://www.amazon.com";


    @Test

    public void test1(){
        driver.get(baseUrl);
        System.out.println("application launched");
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Books");
        System.out.println("sending keys to books field");
    }
    @Test
    public void test2(){
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iPhone");
        System.out.println("sending keys to iPhone field");
    }

    @Test
    public void test3(){
        driver.findElement(By.xpath("//span[@class='nav-line-1']")).click();
        System.out.println("clicked on Hello.sign in field");
    }
    @Test
    public void test4(){

        driver.findElement(By.xpath("//span[@class='nav-line-2']")).click();
    }



    @Test
    public void test10(){
        driver.get(baseUrl);
        driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();
    }
    @Test
    public void test11(){
        driver.get(baseUrl);
        driver.findElement(By.xpath("//span[@class='nav-cart-icon nav-sprite']")).click();
    }

    @Test
    // Go back to Home Page
    public void navigateBack(){

        driver.navigate().back();
    }
    @Test
    // Go forward to Registration page
    public void navigateForward()
    {
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
