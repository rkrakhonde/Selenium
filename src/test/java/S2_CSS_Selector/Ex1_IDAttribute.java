package S2_CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_IDAttribute
{
    public static void main(String[]args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        //Enter Name
       //driver.findElement(By.cssSelector("input#name")).sendkeys("abc");
       //driver.findElements(By.cssSelector("*#name")).sendkeys("keys");
       driver.findElement(By.cssSelector("#name")).sendKeys("abc");


       //Enter pwd
        driver.findElement(By.cssSelector("input#email")).sendKeys("xyz");


    }
    }
