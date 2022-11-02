import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends BasePage {

    public ConfirmationPage(){
        PageFactory.initElements(driver,this);

    }

    @FindBy(css = "h1")
    WebElement myAccountText;


   public void validateVisibleElement(){
      isElementVisible(myAccountText);
   }
}
