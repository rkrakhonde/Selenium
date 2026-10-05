package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex8_LinkText
{
    public static void main(String[]args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///c:/Users/sanja/OneDrive/Pictures/LinkText_PartialLinktext.html");

        //click on Instagram link
        driver.findElement(By.linkText("instagram")).click();




    }
}
