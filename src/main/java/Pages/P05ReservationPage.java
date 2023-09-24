package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class P05ReservationPage {
    private WebDriver driver;
    private WebDriverWait wait;
    private static final int TIMEOUT = 30;

    public P05ReservationPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(TIMEOUT));
    }

    private void scrollToAndClick(By locator) {
        WebElement element = driver.findElement(locator);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        element.click();
    }

    private By district = By.cssSelector("div button[data-id=\"selectDistrict\"]");

    public P05ReservationPage selectDis() {
        scrollToAndClick(district);
        return this;
    }

    private By chooseDist = By.id("bs-select-1-0");

    public P05ReservationPage chooseDistrict() {
        scrollToAndClick(chooseDist);
        return this;
    }

    private By click = By.className("headersearch");

    public P05ReservationPage clickPage() {
        scrollToAndClick(click);
        return this;
    }

    private By compound2 = By.cssSelector("div[class=\"dropdown-menu  show\"] input[type=\"search\"]");

    public P05ReservationPage searchComp(String comp) {
        driver.findElement(compound2).sendKeys(comp);
        return this;
    }

    private By chooseComp = By.id("bs-select-2-20");

    public P05ReservationPage chooseCompound() {
        scrollToAndClick(chooseComp);
        return this;
    }

    private By dateMonth = By.id("demo");

    public P05ReservationPage Month() {
        scrollToAndClick(dateMonth);
        return this;
    }

    private By dateDayForm = By.cssSelector("div[class=\"drp-calendar left\"] td[data-title=\"r3c4\"]");

    public P05ReservationPage dayForm() {
        scrollToAndClick(dateDayForm);
        return this;
    }

    private By dateDayTo = By.cssSelector("div[class=\"drp-calendar right\"] td[data-title=\"r0c5\"]");

    public P05ReservationPage dayTo() {
        scrollToAndClick(dateDayTo);
        return this;
    }

    private By Apply = By.cssSelector("button[class=\"applyBtn btn btn-sm btn-primary\"]");

    public P05ReservationPage apply() {
        scrollToAndClick(Apply);
        return this;
    }

    private By search = By.className("btn-find");

    public P05ReservationPage searchBtn() {
        scrollToAndClick(search);
        return this;
    }

    private By unit = By.cssSelector("div[class=\"img-item img-1\"] [class=\"overload\"]");

    public P05ReservationPage chooseUnit() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(unit));
        WebElement hover = driver.findElement(unit);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,300)");
        Actions action = new Actions(driver);
        action.moveToElement(hover).click().perform();
        return this;
    }



    private By BookNow = By.id("bookNow-1032");

    public P05ReservationPage BookNowBtn() {
        scrollToAndClick(BookNow);
        return this;
    }

    private By IAgree = By.id("policyAgreegation");

    public P05ReservationPage IAgreeBtn() {
        scrollToAndClick(IAgree);
        return this;
    }

    private By checkOut = By.cssSelector("button[class=\"btn checkout\"]");

    public P05ReservationPage checkOutBtn() {
        scrollToAndClick(checkOut);
        return this;
    }
}

