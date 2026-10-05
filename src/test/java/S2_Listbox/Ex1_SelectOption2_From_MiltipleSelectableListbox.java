package S2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1_SelectOption2_From_MiltipleSelectableListbox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testsutomationpractice.blogspot.com/");


        WebElement colors = driver.findElement(By.xpath("//select['@id='colors']"));


        Select s = new Select(colors);


        //3:call select class methods
        //s.selectByVisibleText("Blue");
        s.selectByValue("yellow");
        //s.selectByIndex(0);
        //s.selectByIndex(5);
    }
}


