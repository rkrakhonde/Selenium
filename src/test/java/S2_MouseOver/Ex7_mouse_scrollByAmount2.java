package S2_MouseOver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex7_mouse_scrollByAmount2
{
    public static void main(String[]args)throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(3000);


        Actions act=new Actions(driver);

        for (int i=1; i<=30; i++)
        {
            act.scrollByAmount(0,100).perform();
            Thread.sleep(200);
        }
    }

}
