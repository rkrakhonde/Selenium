package S2_WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Ex2_GetcolSize {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        List<WebElement> allcols = driver.findElements(By.xpath("//table[@name='BookTable']//tr[3]/td"));
        int colsize = allcols.size();
        System.out.println(colsize);

        int colsize1 = driver.findElements(By.xpath("//table[@name='BookTable']//tr[3]/td")).size();
        System.out.println(colsize1);

        System.out.println(driver.findElements(By.xpath("//table[@name='BookTable']//tr[3]/td")).size());
    }
}