package TestCases;

import Pages.P03DataProviderPage;
import Pages.P04LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Login extends TestBase{

    protected P04LoginPage SignIn;

    SoftAssert soft = new SoftAssert();

    @Test (dataProvider = "invalid phone number and invalid password", dataProviderClass = P03DataProviderPage.class)
    public void InvalidNumberAndPass (String phone, String pass)
    {
        SignIn = new P04LoginPage(driver, null);
        // user should wait while page loading
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@href=\"https://host-n.com/login\"]")));
        SignIn.LoginBtn();
        // user enter invalid phone number
        SignIn.EnterPhoneNumber(phone);
        // user enter valid password
        SignIn.EnterPassword(pass);
        // user click on signIn button
        SignIn.signInBtn();

        // user verified the words of the error
        String actualMsg = driver.findElement(By.xpath("//*[@class=\"alert alert-danger\"]")).getText();
        soft.assertTrue(actualMsg.contains("Login credential are invalid."),
                "actualMsg : "+actualMsg +" | "+ "Login credential are invalid.");

        soft.assertAll();
    }
}
