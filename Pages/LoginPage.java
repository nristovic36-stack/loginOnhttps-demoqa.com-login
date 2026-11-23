package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver driver;
    WebElement usernameField;
    WebElement passwordField;
    WebElement loginButton;
    WebElement error;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsernameField() {
        return driver.findElement(By.id("userName"));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.id("login"));
    }

    public WebElement getError() {
        return driver.findElement(By.id("name"));
    }

    //-----------------------

    public void inputUsername(String username) {
        getUsernameField().clear();
        getUsernameField().sendKeys(username);
    }

    public void inputPassword(String password) {
        getPasswordField().clear();
        getPasswordField().sendKeys(password);
    }

    public void clickOnLoginButton() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", getLoginButton());
        getLoginButton().click();
    }

    public String errorText() {
        return getError().getText();
    }

}
