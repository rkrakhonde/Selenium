package S2_MouseOver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex7_mouse_scrollByAmount
{
    public static void main(String[]args)throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);

        Actions act=new Actions(driver);


        //scroll down -1st para=0,2nd para=+ve pixal value
        act.scrollByAmount(0,900).perform();
        Thread.sleep(4000);

        //scroll up -1st para=0, 2nd para=0 pixal value
        act.scrollByAmount(0,-400).perform();


        //scroll right -1st para=+ve, 2nd para=0 pixal value
        //act.scrollByAmount(100'0).perform();

       // scroll right -1st para=-ve,2nd para=0 pixel value
          //  act.scrollByAmount(-100,0).perform();
    }
}
