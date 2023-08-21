package TestCases;

import Pages.P01HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    protected WebDriver driver;
   protected P01HomePage home;

    @BeforeMethod
    public void OpenBrowser ()
    {
        driver = new FirefoxDriver();

        //Maximize Window
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        //Navigate to home page
        driver.get("https://host-n.com/");
        home = new P01HomePage(driver);
    }

    @AfterMethod
    public void quitDriver () throws InterruptedException {
        Thread.sleep(Duration.ofSeconds(5));
        driver.quit();
    }
}
