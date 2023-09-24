package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P04LoginPage {
    private WebDriver driver;

    private  int timeout=30;
    private WebDriverWait wait;

    public P04LoginPage (WebDriver driver, By selector)
    {
        this.driver = driver;
        if(selector != null){
            wait = new WebDriverWait(driver, Duration.ofSeconds(this.timeout));
            wait.until(ExpectedConditions.elementToBeClickable(selector));
        }
    }

    private By loginTab = By.xpath("//*[@href=\"https://host-n.com/login\"]");
    public P04LoginPage LoginBtn ()
    {
        driver.findElement(loginTab).click();
        return new P04LoginPage(driver, null);
    }
    public P05ReservationPage LoginBTn ()
    {
        driver.findElement(loginTab).click();
        return new P05ReservationPage(driver);
    }

    private By phoneNumber = By.id("phone");
    public P04LoginPage EnterPhoneNumber (String number)
    {
        driver.findElement(phoneNumber).sendKeys(number);
        return new P04LoginPage(driver, phoneNumber);
    }
    public P05ReservationPage EnterPhoneNum(String num)
    {
        driver.findElement(phoneNumber).sendKeys(num);
        return new P05ReservationPage(driver);
    }

    private By password = By.className("form-control");
    public P04LoginPage EnterPassword (String Pass)
    {
        driver.findElement(password).sendKeys(Pass);
        return new P04LoginPage(driver, password);
    }
    public P05ReservationPage EnterPass(String pass)
    {
        driver.findElement(password).sendKeys(pass);
        return new P05ReservationPage(driver);
    }

    private By signIn = By.xpath("//*[@type=\"submit\"]");
    public P04LoginPage signInBtn ()
    {
        driver.findElement(signIn).click();
        return new P04LoginPage(driver, signIn);
    }
    public P05ReservationPage SignInBtn()
    {
        driver.findElement(signIn).click();
        return new P05ReservationPage(driver);
    }
}
