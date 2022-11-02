import base.BasePage;
import config.BaseConfig;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(){

        PageFactory.initElements(driver,this);
        driverSetup(BaseConfig.properties.getProperty("driverConfigEnabled"), BaseConfig.properties.getProperty("browser"), BaseConfig.properties.getProperty("url"));
    }

    @FindBy(css = ".login")
    WebElement SignInBtn;


    @FindBy(xpath = "//input[@id='email_create']" )
    WebElement emailAddress;

    @FindBy(xpath = )


}
