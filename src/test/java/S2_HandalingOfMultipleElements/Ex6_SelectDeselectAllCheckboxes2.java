package S2_HandalingOfMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex6_SelectDeselectAllCheckboxes2
{
    public static void main(String[]args)throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(3000);

        List<WebElement> allCheckboxes=driver.findElements(By.xpath("//div[@class='form-group']//input[@type='checkbox']"));

        for (WebElement singleCheckbox:allCheckboxes) {
            singleCheckbox.click();
            Thread.sleep(1000);

        }
        for (WebElement singleCheckbox:allCheckboxes)
        {
            singleCheckbox.click();
            Thread.sleep(1000);
        }
    }
}
