package S2_Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2
{
    public static void main(String[]args)throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");


        driver.findElement(By.xpath("(//div[@class='css-1xc3v61-indicatorContainer'])[1]")).click();
    }

    }

