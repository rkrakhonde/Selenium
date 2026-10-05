package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_XpathByText1
{
    public static void main(String[]args)throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        Thread.sleep(2000);

        //click on simple Alert button
        driver.findElement(By.xpath("//button[text()='Simple Alert']")).click();
    }
}
