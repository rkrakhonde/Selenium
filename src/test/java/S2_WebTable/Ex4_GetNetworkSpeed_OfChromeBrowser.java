package S2_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex4_GetNetworkSpeed_OfChromeBrowser
{
    public static void main(String[]args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        String text1 = driver.findElement(By.xpath("//td[text()='Chrome']//parent::tr/td[contains(text(),'Mbps')]")).getText();
        System.out.println(text1);
    }
    }


