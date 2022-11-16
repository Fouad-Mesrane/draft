package pageObjectModel;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.GenerateData;

public class SignupPage extends BasePage {

    public SignupPage(){
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "signupContainer")
    WebElement signupContainer;

    @FindBy(xpath = "//input[@id='signupFirstName']")
    WebElement signupFirstName;
    @FindBy(xpath = "//input[@id='signupLastName']")
    WebElement signupLastName;
    @FindBy(xpath = "//input[@id='signupEmail']")
    WebElement signupEmail;
    @FindBy(xpath = "//*[@id=\"signupReCaptcha\"]/div/div/iframe")
    WebElement signupreCaptchaiFrame;
    @FindBy(css = "#rc-anchor-alert + input ")
    WebElement reCAPTCHACheckbox;
    @FindBy(xpath = "//button[@id='signupBtn']")
    WebElement signupBtn;

    @FindBy(xpath = "//*[@id=\"iFrameResizer0\"]")
    WebElement passwordiFrame;
    @FindBy(xpath = "//*[@id=\"createAccountModal\"]/div")
    WebElement passwordContainer;
    @FindBy(xpath = "//*[@id=\"newPw\"]")
    WebElement password;
    @FindBy(xpath = "//*[@id='NewPasswordConfirm']")
    WebElement confirmPassword;
    String setPassword = GenerateData.password();
    @FindBy(id = "setNewPassword")
    WebElement passwordBtn;




    public LandingPage createAcc(){
        waitForEleToBeVisible(signupContainer);
        sendKeysToElement(signupFirstName, GenerateData.firstName());
        sendKeysToElement(signupLastName, GenerateData.lastName());
        sendKeysToElement(signupEmail, GenerateData.email());

        switchToFrameByElement(signupreCaptchaiFrame);
        jsClickOnElement(reCAPTCHACheckbox);
        // sometimes there is picture challenge problem
        switchToParentFrame();
        clickOnElement(signupBtn);
        waitForEleToBeVisible(passwordContainer);
        webDriverWait.until(ExpectedConditions.visibilityOf( passwordiFrame));
        switchToFrameByElement(passwordiFrame);
        sendKeysToElement( password,setPassword);
        sendKeysToElement(confirmPassword,setPassword);
        safeClickOnElement(passwordBtn);
        switchToParentFrame();


        return new LandingPage();
    }
}
