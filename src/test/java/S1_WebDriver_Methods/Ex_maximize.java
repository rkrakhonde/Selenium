package S1_WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_maximize
{
    public static void main(String[]args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        Thread.sleep(2000);

        driver.manage().window().maximize();

      //  Options s1=driver.manage();
    //    window s2=s1.window();
       // s2.maximiz();






    }












}
