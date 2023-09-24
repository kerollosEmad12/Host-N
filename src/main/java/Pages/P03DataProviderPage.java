package Pages;

import org.testng.annotations.DataProvider;

public class P03DataProviderPage {

    @DataProvider (name = "invalid first name and last name")
    public static Object [] [] Data ()
    {
        return new Object[][] {
                {"","Dev "},
                {"F","Dev "},
                {"Fa","Dev "},
                {"fabrica",""},
                {"fabrica","D "},
                {"fabrica","Dev "},
        };
    }

    @DataProvider (name = "Invalid phone number")
    public static Object [] [] data ()
    {
        return new Object[][]
                {
                        {"0125489355"},
                        {"656587566882"},
                        {"0103358asd97"},
                        {"0103358477 5"}
                };
    }

    @DataProvider (name = "Invalid Email")
    public static Object [] [] NewData ()
    {
        return new Object[][]
                {
                        {"m.elzoghbi24gmail.com"},
                        {"m.elzoghbi24@gmail"},
                        {"@gmail.com"},
                        {"m.elzoghbi24@@gmail.com"},
                        {"m.elzoghbi24@-gmail.com"},
                        {"m.elzoghbi24@ gmail.com"},
                        {"m.elzoghbi24@gmail.com"}
                };
    }

    @DataProvider (name = "invalid password and confirmPassword")
    public static Object [] [] InvalidData ()
    {
        return new Object[][]
                {
                        {"fa123","FABRICA123!"},
                        {"Fabr12","FABRICA123!"},
                        {"@#%*&^!@","FABRICA123!"},
                        {"FABRICA123!","abrica124!"},
                        {"ABRICA123!","fa123"},
                        {"FABRICA123!","Fabr12"},
                        {"FABRICA123!","@#%*&^!@"},
                        {"FABRICA123!","kerolos123!"}
                };
    }

    @DataProvider (name = "invalid phone number and invalid password")
    public static Object [] [] invalidPhoneAndPassData ()
    {
        return new Object[][]
                {
                        {"1234","123456789"},
                        {"01024556845 ","123456789"},
                        {"133584776","123456789"},
                        {"test@gmail.com","123456789"},
                        {"0103358!4776","123456789"},
                        {"01033584776",""},
                        {"01033584776","1"},
                        {"01033584776","12345"},
                        {"01033584776","12345678"},
                        {"01033584776","123@asda"}
                };
    }

    @DataProvider (name = "Enter Phone Number and Password for reserve")
    public static Object [] [] reserveData ()
    {
        return new Object[][]
                {
                        {"01033584776", "123456789"}
                };
    }
}
