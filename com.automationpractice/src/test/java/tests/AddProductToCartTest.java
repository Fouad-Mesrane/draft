package tests;

import base.BasePage;
import config.BaseConfig;
import org.testng.annotations.Test;
import page_object_library.HomePage;
import page_object_library.SearchResultsPage;

public class AddProductToCartTest extends BasePage {


    @Test
    public void addToCart(){
        HomePage homePage = new HomePage();
        homePage.login(BaseConfig.properties.getProperty("email"),BaseConfig.properties.getProperty("password") );
        SearchResultsPage searchResultsPage = homePage.search("dress");
        searchResultsPage.addToCart("Printed Chiffon Dress");

    }
}
