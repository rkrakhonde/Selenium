package S2_SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.time.Duration;

public class Ex1_ImplicitWait
{
    public static void main(String[]args)throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);


        //click on close btn
        driver.findElement(By.xpath("//span[@class='b3wT1E']")).click();
      Thread.sleep(2000);

        //search mobile
        driver.findElement(By.xpath("(//input[@class='nw1UBF v1zwn26'])[1]")).sendKeys("Samsung s20 fe 5g");

        //click on search icon
        driver.findElement(By.xpath("(//button[@class='XFwMiH'])[1]")).click();



        //get ratings
        String ratings=driver.findElement(By.xpath("((//div[@class='jIjQ8S'])[1]//span[@class='PvbNMB']//span)[2]")).getText();
        System.out.println(ratings);

    }

    }

