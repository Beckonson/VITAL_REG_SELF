package utils;

import pages.BirthRegPage;
import pages.ForeignBirthRegPage;
import pages.LoginPage;

public class PageInitializer {
    public static LoginPage login;
    public static BirthRegPage birthreg;
    public static ForeignBirthRegPage foreignbirthreg;
    public static void initializePageObjects(){
        login =new LoginPage();
        birthreg =new BirthRegPage();
        foreignbirthreg = new ForeignBirthRegPage();
    }
}
