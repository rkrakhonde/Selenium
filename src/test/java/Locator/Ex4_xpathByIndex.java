package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_xpathByIndex
{
    public static void main(String[]args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        //Enter Name
        driver.findElement(By.xpath("//input[@type='text'])[1]")).sendKeys("abc");

        //Enter Email
        driver.findElement(By.xpath("//input[@class='form-control'])[2]")).sendKeys("xyz");

        //Enter Phone
        driver.findElement(By.xpath("//input[@type='text'][3]")).sendKeys("7777777777");

    }
    }

