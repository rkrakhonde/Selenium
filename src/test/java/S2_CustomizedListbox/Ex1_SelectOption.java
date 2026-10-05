package S2_CustomizedListbox;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class Ex1_SelectOption
{
    public static void main(String[]args)throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(2000);


        //1:
        WebElement country =driver.findElement(By .xpath("//select[@id='country']"));

        //2:
        Actions act=new Actions(driver);

        //3:
        act.click(country).perform();
        Thread.sleep(2000);


        //4:
        act.sendKeys(Keys.ARROW_DOWN).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.ARROW_UP).perform();
        Thread.sleep(2000);
        act.sendKeys(Keys.ENTER).perform();


    }
}
