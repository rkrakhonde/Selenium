package S2_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Ex1_SwitchToFrame
{
    public static void main(String[]args)throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");


        //switch to frame
        // driver.switchTo().frame("iframeResult"); //frameIdorName
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));   //from WebElement
        //driver.switchTo().frame(0)   frame index


        //click on date & time button
        driver.findElement(By.xpath("//button[contains(text(),'Date and Time')]")).click();
    }


    }

