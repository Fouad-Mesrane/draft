package tests;

import base.BasePage;
import config.BaseConfig;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import page_object_library.HomePage;

public class SearchBarTest extends BasePage {



    @Test
    public void search() {

        HomePage homePage = new HomePage();
        homePage.search(BaseConfig.properties.getProperty("search"));


    }
}
