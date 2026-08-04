package S1_WebDriver_Methods;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Ex_getTitle
{
    public static void main(String[]args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");



        String actTitle = driver.getTitle();
        System.out.println(actTitle);


        System.out.println("-----");

        System.out.println(driver.getTitle());

    }







}
