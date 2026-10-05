package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6_ID
{
    public static void main(String[]args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///D:/java/Batches/2026/9th%20may%202026/Html%20files/Tagname.html");


        //Enter UN
        driver.findElement(By.id("1234")).sendKeys("abc");

        //Enter pwd
        driver.findElement(By.id("5678")).sendKeys("xyz");
    }

}
