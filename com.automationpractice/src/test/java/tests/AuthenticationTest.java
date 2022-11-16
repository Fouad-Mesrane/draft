package tests;

import annotations.RetryCount;
import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import page_object_library.LandingPage;
import page_object_library.HomePage;
import utils.ExcelData;

import java.io.File;

public class AuthenticationTest extends BasePage {

    @Test(dataProvider = "credentials")
    @RetryCount(1)
    public void login(String email, String password) {
        HomePage homePage = new HomePage();
        LandingPage landingPage = homePage.login(email,password);
        boolean match = landingPage.validateVisibleElement();
        Assert.assertTrue(match);
    }



    // drive login data from Excel File

    @DataProvider(name = "credentials")
    public Object[][] getCredentialsData(){
        String filePath = System.getProperty("user.dir") + File.separator + "data" + File.separator + "automation_practice_credentials.xlsx";
        ExcelData dataFromExcel = new ExcelData(filePath);
        Object[][] data = dataFromExcel.readStringArrays("LoginCredentials");
        return data;
    }




}
