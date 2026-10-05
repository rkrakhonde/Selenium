package S2_Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Ex2_SwitchToMainPage_FromIFrame
{
    public static void main(String[]args)throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");

        //switch to frame
        driver.switchTo().frame("iframeResult");          //frameIdOrName

        //click on date &time button from iframe
        driver.findElement(By.xpath("//button[contains(text(),'Date and Time')]")).click();

        //switch to main page from iframe
        // driver .switchTo().parentFrame();
        driver.switchTo().defaultContent();


        //click on open menu option from main page
        driver.findElement(By.xpath("//a[@id='menuButton']")).click();
    }


}
