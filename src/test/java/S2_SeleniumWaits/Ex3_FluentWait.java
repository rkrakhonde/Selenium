package S2_SeleniumWaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;

public class Ex3_FluentWait {
    public static void main(String[] args)throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Thread.sleep(2000);

        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(5));//specify the timeout if the wait
        wait.pollingEvery(Duration.ofSeconds(1/2));//specify polling time
        //  wait.ignoring(NoSuchElementExeption.class);   //specify what exceptions to ignore


        WebElement simpleAlert = driver.findElement(By.xpath("//button[text()='Simple Alert']"));

        wait.until(ExpectedConditions.elementToBeClickable(simpleAlert));
        simpleAlert.click();
        wait.until(ExpectedConditions.alertIsPresent());//this is how we specify thecondition to wait on

    }
}
