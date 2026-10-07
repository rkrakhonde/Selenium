package S2_Popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import java.util.ArrayList;
import java.util.Set;

public class Ex3_SwitchToChildWindow
{
    public static void main(String[]args) throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");

        //click onNewTab button from main page
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();
        Thread.sleep(5000);


        //get child window id
        Set<String> allIds =driver.getWindowHandles();     //[mainpageId, childWindowId]
        ArrayList<String> a1=new ArrayList<>(allIds);      //[mainpageId(0),childwindow(1)]
        String childWindowId=a1.get(1);

        //switch to child
        driver.switchTo().window(childWindowId);             //string childchildwindow


        //click on Training link from child window
        driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();


    }
}
