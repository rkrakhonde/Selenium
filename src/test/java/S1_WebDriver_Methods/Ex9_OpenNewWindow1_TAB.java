package S1_WebDriver_Methods;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex9_OpenNewWindow1_TAB
{
    public static void main(String[]args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        //driver.switchTo(),newWindow("TAB/WINDOW")
        driver.switchTo().newWindow(WindowType.TAB);   //TAB or WINDOW   ->(enumName.attributeName)

        //WindowType  ->Enum Name-> use to create constants
        //TAB/WINDOW  ->attributes from windowType enum

    }
}
