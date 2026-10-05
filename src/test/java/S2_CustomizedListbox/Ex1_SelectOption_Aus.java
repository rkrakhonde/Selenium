package S2_CustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class Ex1_SelectOption_Aus
{
    public static void main(String[]args)throws  InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(3000);


        //1:
        WebElement country =driver.findElement(By.xpath("//select[@id='country']"));


        //2:
        Actions act=new Actions(driver);


        //3:
        act.click(country).perform();
        Thread.sleep(2000);


        //navigateb to Australia option using Arrow_down key
        for (int i=1; i<=5;i++) {
            act.sendKeys(Keys.ARROW_DOWN).perform();
            Thread.sleep(300);
        }
        //select option using enter key
        Thread.sleep(2000);
        act.sendKeys(Keys.ENTER).perform();
        }


    }

