package S2_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Ex3_SwitchToNestedFrame
{
    public static void main(String[]args)throws IOException
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://autotestsandbox.com/examples/nested-iframes");

        //switch to outer frame
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='outer nested frame']")));

        String text1 =driver.findElement(By.xpath("//p[text()'outer iframe']")).getText();
        System.out.println(text1);

        //switch to inner frame
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='Inner']")));


        String text2 = driver.findElement(By.xpath("//p[text()='Inner iframe content']")).getText();
        System.out.println(text2);

    }
}
