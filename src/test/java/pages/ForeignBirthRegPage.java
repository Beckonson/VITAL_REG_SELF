package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class ForeignBirthRegPage extends CommonMethods {


    @FindBy(xpath = "//span[contains(normalize-space(),'Foreign Birth Notification')]")
    public WebElement foreignbrth;
    @FindBy(xpath = "//button[contains(normalize-space(),'Start new application')]")
    public WebElement foreignregstart;

    @FindBy(css = "#consent-checkbox")
    public WebElement checkreq;


    @FindBy(xpath = "//button[normalize-space()='Proceed']")
    public WebElement proceedbtn;

    @FindBy(id = "cardNumber")
    public WebElement bankcard;

    @FindBy(css = "[name='cardExpiry']")
    public WebElement carddt;

    @FindBy(css = "[name='cvv']")
    public WebElement bkcvv;


    @FindBy(name = "cardName")
    public WebElement cardtyp;

    @FindBy(id = "billingAddress")
    public WebElement billadr;

    @FindBy(css = "#react-select-2-placeholder")
    public WebElement countrydrop;

    @FindBy(xpath = "//div[text()='Norway']")
    public WebElement option;

    @FindBy(css = "[name='postalCode']")
    public WebElement zipcd;

    @FindBy(className = "submit_btn")
    public WebElement submitbt;



    public ForeignBirthRegPage(){
        PageFactory.initElements(driver, this);
    }
}
