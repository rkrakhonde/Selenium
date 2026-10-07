package S3_POM_With_Pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage
{
    //1:Declaration
    @FindBy(xpath = "//div[@class='app_logo']")private WebElement logoText;

    //2:intialization
    public SwagLabHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    public String getLogoText()
    {
        String actLogoText=logoText.getText();
        return actLogoText;
    }
}
