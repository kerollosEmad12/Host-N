package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P04LoginPage {
    private WebDriver driver;

    public P04LoginPage (WebDriver driver)
    {
        this.driver = driver;
    }

    private By loginTab = By.xpath("//*[@href=\"https://host-n.com/login\"]");
    public P04LoginPage LoginBtn ()
    {
        driver.findElement(loginTab).click();
        return new P04LoginPage(driver);
    }

    private By phoneNumber = By.id("phone");
    public P04LoginPage EnterPhoneNumber (String number)
    {
        driver.findElement(phoneNumber).sendKeys(number);
        return new P04LoginPage(driver);
    }

    private By password = By.className("form-control");
    public P04LoginPage EnterPassword (String Pass)
    {
        driver.findElement(password).sendKeys(Pass);
        return new P04LoginPage(driver);
    }

    private By signIn = By.xpath("//*[@type=\"submit\"]");
    public P04LoginPage signInBtn ()
    {
        driver.findElement(signIn).click();
        return new P04LoginPage(driver);
    }
}
