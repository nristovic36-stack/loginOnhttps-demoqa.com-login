package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {

    WebDriver driver;
    WebElement usernameValue;
    WebElement logOutButton;

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsernameValue() {
        return driver.findElement(By.id("userName-value"));
    }

    public WebElement getLogOutButton() {
        return driver.findElement(By.id("submit"));
    }

    //-----------------------

    public String usernameText() {
        return getUsernameValue().getText();
    }

    public void clickOnLogOutButton() {
        getLogOutButton().click();
    }

}
