package S2_HandalingOfMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class EX2_getAllTheLinksur1_fromWebPage
{
    public static void main(String[]args)throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);

        List<WebElement> allLinks =driver.findElements(By.xpath("//a"));

        for (WebElement link:allLinks)
        {
            String text =link.getAttribute("href");
            System.out.println(text);
        }

    }
}
