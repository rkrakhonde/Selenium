package S2_Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1
{
    public static void main(String[]args)throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.meesho.com/");


        //enter customer ID
        boolean result=driver.findElement(By.xpath("//img[@alt='Meesho Logo']")).isDisplayed();
        System.out.println(result);


        driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("abc");
    }
}
