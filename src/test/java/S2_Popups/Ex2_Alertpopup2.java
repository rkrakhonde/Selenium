package S2_Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2_Alertpopup2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/delete_customer.php");

        //enter customer ID
        driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("123");

        //click on submit button
        driver.findElement(By.xpath("//input[@name='submit']")).click();


        //switch to alert popup
        Alert alt = driver.switchTo().alert();

        //gettext from from alert popup
        String text = alt.getText();
        System.out.println(text);
        Thread.sleep(2000);


        //click on cancel button from alert popup
        //  alt.dismiss();

        //click on ok button from 1st alert popup
        alt.accept();
        Thread.sleep(2000);

        //click on ok button from 2nd alert popup
        alt.accept();

        //Enter input in alert popup
        //alt.sendkeys("kldkndd");
    }

}
