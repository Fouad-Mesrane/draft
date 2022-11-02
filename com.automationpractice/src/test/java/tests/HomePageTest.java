package tests;

import config.BaseConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_object_library.ConfirmationPage;
import page_object_library.HomePage;

public class AuthenticationTest {

    @Test
    public void login() {
        HomePage homePage = new HomePage();
        ConfirmationPage confirmationPage = homePage.authentication(BaseConfig.properties.getProperty("email"),BaseConfig.properties.getProperty("password"));
        boolean match = confirmationPage.validateVisibleElement();
        Assert.assertTrue(match);
    }


}
