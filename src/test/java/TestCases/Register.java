package TestCases;

import Pages.P01HomePage;
import Pages.P02RegistrationPage;
import Pages.P03DataProviderPage;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class Register extends TestBase{
    protected P02RegistrationPage register;

    public static String globalEmail;

    Faker faker = new Faker();
    SoftAssert soft = new SoftAssert();

    @Test (priority = 1, dataProvider = "invalid first name and last name", dataProviderClass = P03DataProviderPage.class)
    public void InvalidData(String firstName, String LastName)
    {
       home = new P01HomePage(driver);
       register = new P02RegistrationPage(driver);

       // user should wait while page loading
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.className("sign__up")));

        // user click on signup button
       home.registerBtn();

       // user enter first name
       register.EnterFirstName(firstName);

       // user enter last name
       register.EnterLastName(LastName);

       // user enter random phone number
       String phoneNumber = faker.numerify("010########");
       register.EnterMobile(phoneNumber);

       // user enter random email
       globalEmail = faker.internet().emailAddress();
       register.EnterEmail(globalEmail);

       // user enter valid password
       register.EnterPassword("Test123!");

       // user enter confirm password matched with password
       register.EnterConfirmPass("Test123!");

       // user click on create account button
       register.clickSub();

       // user verified the words of the error
       String actualMsg = driver.findElement(By.cssSelector("div[class=\"invalid-feedback \"]:nth-child(2) strong")).getText();
       soft.assertTrue(actualMsg.contains("The first name must be at least 3 characters."),
               "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"The first name must be at least 3 characters.");

       soft.assertAll();
    }

    @Test(priority = 2, dataProvider = "Invalid phone number", dataProviderClass = P03DataProviderPage.class)
    public void invalidData(String phone)
    {
        home = new P01HomePage(driver);
        register = new P02RegistrationPage(driver);

        // user should wait while page loading
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.className("sign__up")));

        // user click on signup button
        home.registerBtn();

        // user enter first name
        register.EnterFirstName("Fabrica");

        // user enter last name
        register.EnterLastName("Dev");

        // user enter invalid phone number
        register.EnterMobile(phone);

        // user enter random email
        globalEmail = faker.internet().emailAddress();
        register.EnterEmail(globalEmail);

        // user enter valid password
        register.EnterPassword("Test123!");

        // user enter confirm password matched with password
        register.EnterConfirmPass("Test123!");

        // user click on create account button
        register.clickSub();
    }

    @Test (priority = 3, dataProvider = "Invalid Email", dataProviderClass = P03DataProviderPage.class)
    public void InvalidDataEmail (String Email)
    {
        home = new P01HomePage(driver);
        register = new P02RegistrationPage(driver);

        // user should wait while page loading
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.className("sign__up")));

        // user click on signup button
        home.registerBtn();

        // user enter first name
        register.EnterFirstName("Fabrica");

        // user enter last name
        register.EnterLastName("Dev");

        /// user enter random phone number
        String phoneNumber = faker.numerify("010########");
        register.EnterMobile(phoneNumber);

        // user enter invalid email
        register.EnterEmail(Email);

        // user enter valid password
        register.EnterPassword("Test123!");

        // user enter confirm password matched with password
        register.EnterConfirmPass("Test123!");

        // user click on create account button
        register.clickSub();

        // user verified the words of the error
        String actualMsg = driver.findElement(By.cssSelector("div[class=\"invalid-feedback \"]:nth-child(5) strong")).getText();
        soft.assertTrue(actualMsg.contains("The email must be a valid email address."),
                "actualMsg : "+actualMsg +" | "+ "expected Msg : "+"The email must be a valid email address.");

        soft.assertAll();
    }

    @Test (priority = 4, dataProvider = "invalid password and confirmPassword", dataProviderClass = P03DataProviderPage.class)
    public void InvalidPasswordAndConfirmPass (String pass, String confirmPass)
    {
        home = new P01HomePage(driver);
        register = new P02RegistrationPage(driver);

        // user should wait while page loading
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(By.className("sign__up")));

        // user click on signup button
        home.registerBtn();

        // user enter first name
        register.EnterFirstName("Fabrica");

        // user enter last name
        register.EnterLastName("Dev");

        /// user enter random phone number
        String phoneNumber = faker.numerify("010########");
        register.EnterMobile(phoneNumber);

        /// user enter random email
        globalEmail = faker.internet().emailAddress();
        register.EnterEmail(globalEmail);

        // user enter valid password
        register.EnterPassword(pass);

        // user enter confirm password matched with password
        register.EnterConfirmPass(confirmPass);

        // user click on create account button
        register.clickSub();
    }
}
