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
        Login.LoginBTn();
        Login.EnterPhoneNum(phone);
        Login.EnterPass(pass);
        Login.SignInBtn();

        reserve.selectDis();
        reserve.chooseDistrict();
        reserve.clickPage();
        reserve.searchComp("Nice 4");
        reserve.chooseCompound();
        reserve.Month();
        reserve.dayForm();
        reserve.dayTo();
        reserve.apply();
        reserve.searchBtn();
        reserve.chooseUnit();
        reserve.BookNowBtn();
        reserve.IAgreeBtn();
        reserve.checkOutBtn();
    }
}
