import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class Signup extends CommonAPI {

    public void signup(){
        driver.findElement(By.cssSelector("#u_0_c")).sendKeys("Mohammed", Keys.TAB,"Mehadi",Keys.TAB
        ,"Email",Keys.TAB,"password",Keys.TAB,Keys.ARROW_DOWN,Keys.ENTER,Keys.TAB,Keys.ARROW_DOWN,Keys.ENTER,
                Keys.TAB,Keys.ARROW_DOWN,Keys.ENTER,Keys.TAB,Keys.TAB,Keys.ARROW_RIGHT,Keys.ENTER);
    }

}
