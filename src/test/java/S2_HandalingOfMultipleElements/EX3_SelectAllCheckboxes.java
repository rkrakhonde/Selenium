package S2_HandalingOfMultipleElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class EX3_SelectAllCheckboxes
{
    public static void main(String[]args)throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/sanja/IdeaProjects/9th%20May%20Selenium%20Project/HtmlFiles/MultipleCheckboxes.html");
        Thread.sleep(2000);
        List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));

        for (WebElement singlecheckbox : allCheckboxes) {
            singlecheckbox.click();
            Thread.sleep(1000);
        }

        }
    }


