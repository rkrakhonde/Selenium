package S2_Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX1_HiddenDivisionPopup
{
    public static void main(String []args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mobikwik.com/");



        //click on login button
        driver.findElement(By.xpath("(//span[text()='Login'])[1]")).click();


        //perform action on hidden division popup
        //enter mobile number
        driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("9999999999");
    }
}
