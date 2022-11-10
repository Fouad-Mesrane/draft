package pageObjectModel;

import base.BasePage;
import org.openqa.selenium.support.PageFactory;

public class LoginContainer extends BasePage {
    public LoginContainer(){
        PageFactory.initElements(driver,this);
    }
}
