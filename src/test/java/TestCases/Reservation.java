package TestCases;

import Pages.P03DataProviderPage;
import Pages.P04LoginPage;
import Pages.P05ReservationPage;
import org.testng.annotations.Test;

public class Reservation extends TestBase{
    protected P05ReservationPage reserve;

    @Test (priority = 1, dataProvider = "Enter Phone Number and Password for reserve", dataProviderClass = P03DataProviderPage.class)
    public void Reserve (String phone, String pass) {
        P04LoginPage Login = new P04LoginPage(driver, null);
        reserve = new P05ReservationPage (driver);

        // Click Login Button
        Login.LoginBTn();
        // Enter Phone Number To Log-In
        Login.EnterPhoneNum(phone);
        // Enter Password To Log-In
        Login.EnterPass(pass);
        // Click On Sign-In Button
        Login.SignInBtn();

        // Click On District Button
        reserve.selectDis();
        // Choose Specific District
        reserve.chooseDistrict();
        // To Hide List
        reserve.clickPage();
        // Write The Specific Unit
        reserve.searchComp("Nice 4");
        // Selection of the written module
        reserve.chooseCompound();
        // Choose Month
        reserve.Month();
        // Choose Day From
        reserve.dayForm();
        // Choose Day To
        reserve.dayTo();
        // Click On The Apply Button
        reserve.apply();
        // Click On Search Button
        reserve.searchBtn();
        // Choose Specific Unit
        reserve.chooseUnit();
        // Click On Book Now Button
        reserve.BookNowBtn();
        // Click On I Agree CheckBox
        reserve.IAgreeBtn();
        // Click On CheckOut Button
        reserve.checkOutBtn();
    }
}
