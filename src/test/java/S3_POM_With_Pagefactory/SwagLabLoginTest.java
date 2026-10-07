package S3_POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import java.time.Duration;

public class SwagLabLoginTest
{


    public static void main(String[]args)throws InterruptedException {
        //TC1_LoginToApp_withvalidDeatails();
        Tc2_LoginTOApp_withInValidDetails();
    }
    public static void Tc2_LoginTOApp_withInValidDetails() throws InterruptedException
    {
        WebDriver driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.saucedemo.com/" );

        SwagLabLoginPage login=new SwagLabLoginPage(driver);
        login.enterUN("abc");
        Thread.sleep(2000);
        login.enterPWD("xyz");
        Thread.sleep(2000);
        login.clickOnLogionBtn();
        Thread.sleep(2000);
        String actLoginFailedErrorMsg=login.getErrorMsg();
        String extLoginFailedErrorMsg="Username and password do not match";
        if (actLoginFailedErrorMsg.contains(extLoginFailedErrorMsg))
        {
            System.out.println("TC Pass");

        }
            else
        {
            System.out.println("TC Fail");

        }
       Thread.sleep(2000);
            driver.quit();
    }
public static void TC1_LoginToApp_withValidDetails()throws InterruptedException
{
    WebDriver driver=new EdgeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.saucedemo.com/");

    SwagLabLoginPage login=new SwagLabLoginPage(driver);
    login.enterUN("standard_user");
    Thread.sleep(2000);
    login.enterPWD("secret_sauce");
    Thread.sleep(2000);
    login.clickOnLogionBtn();
    Thread.sleep(2000);

    SwagLabHomePage home=new SwagLabHomePage(driver);
    String actLogoText=home.getLogoText();
    String expLogoText="Swag Labs";


    if (actLogoText.equals(expLogoText))
    {
        System.out.println("TC Pass");
    }
    else
    {
        System.out.println("TC Fail");

    }
    Thread.sleep(2000);
    driver.quit();
}
}
