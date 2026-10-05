package S2_HandalingOfMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex1_getSizeOfAllTheLinksFromWebpage
{
    public static void main(String[]args) throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);

        List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
        int size1 = allLinks.size();
        System.out.println(size1);

        int size2=driver.findElements(By.xpath("//a")).size();
        System.out.println(size2);

        System.out.println(driver.findElements(By.xpath("//a")).size());
    }
}
