package Tests;

import Base.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    String validUsername, validPassword;

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/login");
        validUsername = "profesor";
        validPassword = "Profesor123!";
    }

    @AfterMethod
    public void clearCookies() {
        driver.manage().deleteAllCookies();
    }

    @Test(priority = 1)
    public void userCanLogIn() {
        loginPage.inputUsername(validUsername);
        loginPage.inputPassword(validPassword);
        loginPage.clickOnLoginButton();

        wait.until(ExpectedConditions.visibilityOf(profilePage.getUsernameValue()));
        Assert.assertTrue(profilePage.getUsernameValue().isDisplayed());
        Assert.assertEquals(profilePage.usernameText(), validUsername);
        Assert.assertTrue(profilePage.getLogOutButton().isDisplayed());
    }

}
