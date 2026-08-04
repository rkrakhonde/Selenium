package S1_WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_getTitle2
{
    public static void main(String[]args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.Facebook.com/");

        String actTitle=driver.getTitle();
        String expTitle="Facebook";

        if (actTitle.equals(expTitle))
        {
            System.out.println("pass");
        }
        else
        {
            System.out.println("fail");
        }
    }








}
