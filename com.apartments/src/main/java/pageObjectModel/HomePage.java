package pageObjectModel;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    // locators
    @FindBy(css = "a[title='Sign In']")
    WebElement signInBtn;

    @FindBy(css = "a[title='Sign Up']")
    WebElement signUpBtn;

    @FindBy(id = "headerMenuLink")
    WebElement menuBtn;

    @FindBy(id = "headerAddProperty")
    WebElement addPropertyBtn;

    @FindBy(id = "quickSearchLookup")
    WebElement searchInput;
    @FindBy(xpath = "//a[@title='Search apartments for rent']")
    WebElement searchBtn;


}
