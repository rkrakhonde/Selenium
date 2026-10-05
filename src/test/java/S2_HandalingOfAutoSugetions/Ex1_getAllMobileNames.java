package S2_HandalingOfAutoSugetions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;


public class Ex1_getAllMobileNames
{
    public static void main(String[]args)throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        //enter mobile name
        driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
        Thread.sleep(2000);

        List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='G43f7e'])[1]/li"));

        for (WebElement singleOption : allOptions) {
            System.out.println(singleOption.getText());
        }
    }
    }