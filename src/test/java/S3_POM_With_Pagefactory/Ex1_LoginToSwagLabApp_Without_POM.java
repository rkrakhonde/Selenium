package S3_POM_With_Pagefactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Ex1_LoginToSwagLabApp_Without_POM {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        //Enter UN
        driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
        Thread.sleep(2000);


        //Enter PWD
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
        Thread.sleep(2000);


        //click on login button
        driver.findElement(By.xpath("//input[@id='login-button']")).click();
        Thread.sleep(2000);


        //verify logo text
        String actLogoText = driver.findElement(By.xpath("//div[@class='app_logo']")).getText();
        String expLogoText = "Swag Labs";

        if (actLogoText.equals(expLogoText)) {
            System.out.println("Tc Pass");
        } else {
            System.out.println("TC fail");
        }
        Thread.sleep(2000);
        driver.quit();
    }
}