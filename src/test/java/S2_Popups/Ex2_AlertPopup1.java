package S2_Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_AlertPopup1 {
    public static void main(String[] argsString) throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");

        //enter customer ID
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123");


        //click on submit button
        driver.findElement(By.xpath("//input[@name='submit']")).click();


        //gettext from alert popup
        String text = driver.switchTo().alert().getText();
        System.out.println(text);
        Thread.sleep(2000);


        //click on cancel button from alert popup
        //driver.switchTo().alert().dismiss();


        //click on OK button from1st alert popup
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        //click on OK button from 2nd alert popup
        driver.switchTo().alert().accept();

        //Enter input in alert popup
        // driver.switchTo().alert().sendKeys("kldkndd");

    }
}