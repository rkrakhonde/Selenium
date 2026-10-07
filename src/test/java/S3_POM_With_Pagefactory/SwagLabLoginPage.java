package S3_POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage
{
    //1.Data member/variable should be deaclared globally with access level private using @FindBy Annotation
    @FindBy(xpath = "//input[@id='user-name']")private WebElement un;
    @FindBy(xpath = "//input[@id='password']")private WebElement pwd;
    @FindBy(xpath = "//input[@id='login-button']")private WebElement loginBtn;
    @FindBy(xpath = "//h3[contains(text(),'Username and password')]")private WebElement errorMsg;



    //2;Intialize within a constructor with access level public using pagefactory class
    public SwagLabLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);   //classname.methodname(driverobj,thiskeyword)
    }
    //3.Utilize within a method with access level public
    public void enterUN(String UNValue) {
        un.sendKeys(UNValue);
    }
    public void enterPWD(String pwdValue) {
        pwd.sendKeys(pwdValue);
    }
    public void clickOnLogionBtn() {
        loginBtn.click();
    }
    public String getErrorMsg()
    {
        String actErrorMsg=errorMsg.getText();
        return actErrorMsg;
    }
}
