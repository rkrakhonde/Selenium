package S2_ShadowRootElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX1_PerformActionShadowRootElement
{
    public static void main(String[]args)throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://watir.com/examples/shadow_dom.html");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@id='shadow_host']")).getShadowRoot().
                findElement(By.cssSelector("input[type='text']")).sendKeys("abc");
    }
}
