package S1_WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_minimize {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        Thread.sleep(3000);

        driver.manage().window().minimize();




       // WebDriver.Options s1=driver.manage();
      //  WebDriver.Window s2=s1.window();
        //s2.minimize();
    }
}















