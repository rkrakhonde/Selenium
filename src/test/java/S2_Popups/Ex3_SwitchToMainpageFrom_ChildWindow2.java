package S2_Popups;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Set;

public class Ex3_SwitchToMainpageFrom_ChildWindow2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://skpatro.github.io/demo/links/");

        //click on NewTab button from main page
        driver.findElement(By.xpath("//input[@name='NewTab']")).click();
        Thread.sleep(5000);


        //get child window id
        Set<String> allIds = driver.getWindowHandles();    //[mainpageid,childWindow]
        ArrayList<String> a1 = new ArrayList<>(allIds);


        //switch to child
        driver.switchTo().window(a1.get(1));     //string childwindowId

         //click on Training link from child window
        driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
        Thread.sleep(2000);

        //switch to main page
        driver.switchTo().window(a1.get(0));
        Thread.sleep(2000);


        //click on NewWindow button from main page
        driver.findElement(By.xpath("//input[@name='NewWindow']")).click();


        Set<String> allIds2 = driver.getWindowHandles();   // [mainpage.childwindow1,childwindow2]
        ArrayList<String> a12 = new ArrayList<>(allIds2);  //[mainpage[0],childwindow1[1],childwindow2[2]

        //switch To child Window2
        driver.switchTo().window(a12.get(2));
        Thread.sleep(2000);

        driver.close();


    }

}
