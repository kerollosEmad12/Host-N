package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01HomePage {
    // Add Driver
    private WebDriver driver;

    // To Adding Locators
    public P01HomePage(WebDriver driver)
    {
        this.driver = driver;
    }

    By registerTab = By.className("sign__up");

    public P02RegistrationPage registerBtn()
    {
       driver.findElement(registerTab).click();
       return new P02RegistrationPage(driver, null);
    }
}
