package utils;

import pages.BirthRegPage;
import pages.LoginPage;

public class PageInitializer {
    public static LoginPage login;
    public static BirthRegPage birthreg;

    public static void initializePageObjects(){
        login =new LoginPage();
        birthreg =new BirthRegPage();
    }
}
