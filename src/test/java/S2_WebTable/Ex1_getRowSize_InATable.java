package S2_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex1_getRowSize_InATable
{
    public static void main(String[]args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement> allrows=driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
        int rowsize =allrows.size();
        System.out.println(rowsize);

        int rowsize1=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
        System.out.println(rowsize1);

        System.out.println(driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size());
    }
}
