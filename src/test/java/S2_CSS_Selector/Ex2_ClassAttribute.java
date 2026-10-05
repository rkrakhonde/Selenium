package S2_CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_ClassAttribute
{
    public static void main(String[]args)throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(5000);


        //click on start btn
        driver.findElement(By.cssSelector("button.start")).click();
     // driver.findElement(By.cssSelecter("*.start")).click();
     //driver. findElements(By.cssSelector(".start")).click();

    }
}
