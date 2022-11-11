package tests;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjectModel.HomePage;
import pageObjectModel.LandingPage;
import pageObjectModel.LoginContainer;

public class AuthenticationTest extends BasePage {

    @Test
    public void validateLogin(){
        HomePage homePage = new HomePage();
        LoginContainer login = homePage.navigateToLogin();
        LandingPage landingPage = login.authentication();
        Assert.assertTrue(landingPage.isVisibleBtn());
    }
    @Test
    public void errorLoginValidation(){
        HomePage homePage = new HomePage();
        LoginContainer login = homePage.navigateToLogin();
        LandingPage landingPage = login.errorLogin();
        Assert.assertFalse(landingPage.isVisibleBtn());
    }
}
