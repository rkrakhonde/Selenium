package S1_WebDriver_Methods;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_getCurrentURL
{
    public static void main(String[]args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");


        String Url = driver.getCurrentUrl();
        System.out.println(Url);

        System.out.println("------");


        System.out.println(driver.getCurrentUrl());


    }





}
