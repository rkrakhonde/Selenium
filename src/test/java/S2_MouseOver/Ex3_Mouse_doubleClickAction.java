package S2_MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex3_Mouse_doubleClickAction
{
    public static void main(String[]args)throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        Thread.sleep(5000);

        WebElement ele =driver.findElement(By.xpath("//button[text()='Double-click Me To See Alert"));
        Actions act=new Actions(driver);

        //Apr1
      //   act.moveToElement(ele).perform();
       //  act.doubleClick().perform();


        //Apr2:
        //act.moveToElement(ele).doubleclick().perform();

        //Apr3
        act.doubleClick(ele).perform();

    }
}
