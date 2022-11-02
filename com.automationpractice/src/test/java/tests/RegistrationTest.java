import org.testng.Assert;
import org.testng.annotations.Test;
import page_object_library.ConfirmationPage;
import page_object_library.HomePage;
import page_object_library.RegistrationPage;

public class RegistrationTest {

    @Test
    public void registerAnAcct(){
        HomePage homePage = new HomePage();
        RegistrationPage registrationPage = homePage.toRegistrationPage();
        ConfirmationPage confirmationPage = registrationPage.doRegistration();
        Boolean match = confirmationPage.validateVisibleElement();

        Assert.assertTrue(match);



    }
}
