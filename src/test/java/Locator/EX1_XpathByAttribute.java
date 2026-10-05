package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX1_XpathByAttribute
{
    public static void main(String[]args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        //Enter Name
     //   driver.findElement(Locater Type)
    //     driver.findElement(By.xpath(String xpath Expression))
       driver.findElement(By.xpath("//input[@id='name']")).sendKeys("abc");

       //Enter Email
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("xyz");

        //Enter phone Num
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("9999999999");
    }
    }
