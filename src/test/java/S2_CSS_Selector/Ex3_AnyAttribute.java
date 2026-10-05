package S2_CSS_Selector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex3_AnyAttribute {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");
        Thread.sleep(5000);

        //Enter Name
        driver.findElement(By.cssSelector("input[PlaceHolder='Enter Name']")).sendKeys("abc");
        //driver.findElement(By.cssSelector("*[PlaceHolder='Enter Name']")).sendkeys("abc");
        //driver.findElements(By.cssSelector("[PlaceHolder='Enter Name']")).sendkeys("abc");

    }


}