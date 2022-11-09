package tests;

import base.BasePage;
import config.BaseConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_object_library.CartPage;
import page_object_library.HomePage;
import page_object_library.OrderReceiptPage;
import page_object_library.SearchResultsPage;

public class CheckoutAndSubmitTest extends BasePage {

    @Test
    public void submitOrder(){
        HomePage homePage = new HomePage();
        homePage.login(BaseConfig.properties.getProperty("email"),BaseConfig.properties.getProperty("password") );
        SearchResultsPage searchResultsPage = homePage.search(BaseConfig.properties.getProperty("search"));
        CartPage cartPage = searchResultsPage.addToCart(BaseConfig.properties.getProperty("product"));
        OrderReceiptPage orderReceiptPage = cartPage.checkout();
        boolean match = orderReceiptPage.validateOrderConfirmation();

        Assert.assertTrue(match);
        homePage.signOut();


    }
}
