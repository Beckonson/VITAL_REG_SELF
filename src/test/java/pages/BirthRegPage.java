package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class BirthRegPage extends CommonMethods {
    @FindBy(xpath = "//span[normalize-space()='Birth Registration']")
    public WebElement birthregstart;

    @FindBy(xpath = "//button[contains(normalize-space(),'Start new application')]")
    public WebElement newregstart;

    @FindBy(css = "#consent-checkbox")
    public WebElement checkreq;

    @FindBy(xpath = "//button[normalize-space()='Proceed']")
    public WebElement proccedbtn;

    @FindBy(id = "cardNumber")
    public WebElement bankcardno;

    @FindBy(name = "cardExpiry")
    public WebElement carddate;

    @FindBy(name = "cvv")
    public WebElement bnkcvv;


    @FindBy(id = "cardName")
    public WebElement cardtype;

    @FindBy(id = "billingAddress")
    public WebElement billaddr;

    @FindBy(css = "#react-select-2-placeholder")
    public WebElement countrydropdown;

    @FindBy(xpath = "//div[text()='Nigeria']")
    public WebElement option;

    @FindBy(css = "[name='postalCode']")
    public WebElement zipcd;

    @FindBy(className = "submit_btn")
    public WebElement submitbt;


    public BirthRegPage(){
        PageFactory.initElements(driver, this);
    }
}
