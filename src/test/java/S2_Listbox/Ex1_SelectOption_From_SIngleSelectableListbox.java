package S2_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1_SelectOption_From_SIngleSelectableListbox
{
    public static void main(String[]args)throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testsutomationpractice.blogspot.com/");

        //1:identify the Listbox
        WebElement country=driver.findElement(By.xpath("..Selector[@id='country']"));


        //2:create an object of select class withWebElement obj as input
        Select s=new Select(country);



        //3:call select class method
        //s.selectByVisibleText("Japan")     //String text
        //s.SelectByValue("india);           //String value
        s.selectByIndex(7);                  //int index
        Thread.sleep(3000);
    }

}
