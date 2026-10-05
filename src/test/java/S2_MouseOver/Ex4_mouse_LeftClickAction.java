package S2_MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex4_mouse_LeftClickAction
{
    public static void main(String[]args)throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
        Thread.sleep(5000);


        //click on close icon
        driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
        Thread.sleep(2000);

        WebElement cart =driver.findElement(By.xpath("//span[text()='cart']"));
        Actions act=new Actions(driver);


        //Apr1
        //act.moveToElement(Cart).perform();
        //act.click().perform();


        //Apr2:
        //act.moveToElement(cart).click().perform();


        //Apr3
        act.click(cart).perform();

    }
}
