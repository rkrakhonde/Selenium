package S2_ChromeOptions;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ex5_getBrowserName_version
{
    public static void main(String[]args)
    {
        ChromeDriver driver=new ChromeDriver();
        System.out.println(driver.getCapabilities().getBrowserName());
        System.out.println(driver.getCapabilities().getBrowserName());
}



}
