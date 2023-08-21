package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02RegistrationPage {

    private WebDriver driver;
    public P02RegistrationPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By firstname = By.cssSelector("input[name=\"first_name\"]");
    public P02RegistrationPage EnterFirstName (String fName)
    {
        driver.findElement(firstname).sendKeys(fName);
        return new P02RegistrationPage(driver);
    }

    private By lastname = By.cssSelector("input[name=\"last_name\"]");
    public P02RegistrationPage EnterLastName (String lName)
    {
        driver.findElement(lastname).sendKeys(lName);
        return new P02RegistrationPage(driver);
    }

    private By mobilePhone = By.cssSelector("input[name=\"mobile\"]");
    public P02RegistrationPage EnterMobile (String phone)
    {
        driver.findElement(mobilePhone).sendKeys(phone);
        return new P02RegistrationPage(driver);
    }

    private By Email = By.cssSelector("input[name=\"email\"]");
    public P02RegistrationPage EnterEmail (String mail)
    {
        driver.findElement(Email).sendKeys(mail);
        return new P02RegistrationPage(driver);
    }

    private By password = By.name("password");
    public P02RegistrationPage EnterPassword (String pass)
    {
        driver.findElement(password).sendKeys(pass);
        return new P02RegistrationPage(driver);
    }

    private By confirmPassword = By.cssSelector("input[name=\"confirm_password\"]");
    public P02RegistrationPage EnterConfirmPass (String confirmPass)
    {
        driver.findElement(confirmPassword).sendKeys(confirmPass);
        return new P02RegistrationPage(driver);
    }

    private By Submit = By.cssSelector("button[type=\"submit\"]");
    public P02RegistrationPage clickSub ()
    {
        driver.findElement(Submit).click();
        return new P02RegistrationPage(driver);
    }
}
