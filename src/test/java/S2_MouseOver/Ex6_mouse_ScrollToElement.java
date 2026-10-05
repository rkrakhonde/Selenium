package S2_MouseOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ex6_mouse_ScrollToElement
{
    public static void main(String[]args)throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);

        Actions act=new Actions(driver);


        WebElement submit =driver.findElement(By.xpath("(//button[text()='Submit'])[2]"));
        act.scrollToElement(submit).perform();
        Thread.sleep(5000);


        WebElement start =driver.findElement(By.xpath("(//button[text()='START']"));
        act.scrollToElement(start).perform();



    }
}
