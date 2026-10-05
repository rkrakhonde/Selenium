package S2_DynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1_getRatingAndReviewFromFlipKartApp
{
    public static void main(String[]args) throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
                Thread.sleep(2000);


        //click on close btn
        driver.findElement(By.xpath("//span[@class='b3wT}1E']")).click();
        Thread.sleep(2000);

        //search mobile
        driver.findElement(By.xpath("//input[@class='nw1UBF v1zwn26'])[1]")).sendKeys("samsung s20 fe 5g");

        //click on search icon
        driver.findElement(By.xpath("(//button[@class='XFwMiH'])[1]")).click();

        //get ratings
        String ratings=driver.findElement(By.xpath("((//div[@class='jIjQ8S'][1]//span[@class='PvbNMB']//span)[2]")).getText();
        System.out.println(ratings);


        //get reviews
        String reviews =driver.findElement(By.xpath("((//div[@class='jIjQ8s'])[1]//span[@class='PvbNMB']//span)[4]")).getText();
        System.out.println(reviews);

    }


}
