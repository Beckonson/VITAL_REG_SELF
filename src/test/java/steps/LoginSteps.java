package steps;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;

import java.time.Duration;
import java.util.List;

public class LoginSteps extends CommonMethods {

    //WebDriver driver;

    @Given("User navigate to VITALREG portal")
    public void user_navigate_to_vitalreg_portal() {
        StartBrowser();
        /*
        driver = new FirefoxDriver();
        driver.get("https://vital-reg-selfservice-staging.verxid.site/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         */
    }

    @When("user enter valid email and password")
    public void user_enter_valid_email_and_password() {
        //LoginPage login = new LoginPage();
        /*
        WebElement emailFiled = driver.findElement(By.name("email"));
        emailFiled.sendKeys("christy16@yopmail.com");
        WebElement passWordField = driver.findElement(By.id("password"));
        passWordField.sendKeys("@Test123456");
         */

        //sendText(ConfigReader.read("email"), login.emailFiled);
        sendText(login.emailFiled, ConfigReader.read("email"));
        //sendText(ConfigReader.read("password"), login.passWordField);
        sendText(login.passWordField, ConfigReader.read("password"));

    }

    @When("clicks on SIGN IN")
    public void clicks_on_sign_in() {

        //WebElement signInButtton = driver.findElement(By.cssSelector("button[type='submit']"));
        //signInButtton.click();

        click(login.signInButtton);

    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        WebElement dashboard = driver.findElement(By.xpath("//span[contains(normalize-space(),'Dashboard')]"));
        Assert.assertTrue(dashboard.isDisplayed());
        /*

        WebElement toastMsg = driver.findElement(By.xpath("//div[normalize-space()='Welcome back']"));
        List<WebElement> messages = driver.findElements(
                By.xpath("//div[normalize-space()='Welcome back']")
        );
        Assert.assertFalse(messages.isEmpty());
        Assert.assertTrue(messages.get(0).getText().contains("Welcome back"));

        //Assert.assertEquals(getToastMessage("Welcome back"), "Welcome back");

         */

    }

    @Then("user enters {string} and {string} and verify the {string}")
    public void userEntersAndAndVerifyThe(String email1, String password1, String errorMessage) {
        System.out.println("pass");
/*
        //sendText(email1, login.emailFiled);
        sendText(login.passWordField, email1);

        //sendText(password, login.passWordField);
        sendText(login.passWordField, password1);
        click(login.signInButtton);
        getwait();
        login.emailFiled.clear();

        WebElement errorMessageLoc = driver.findElement(By.xpath("//div[contains(normalize-space(),'Incorrect credentials supplied')]"));
        String errorMsg1 = errorMessageLoc.getText();
        //Assert.assertEquals(errorMessage, errorMsg);
        //System.out.println(errorMsg1);
        Assert.assertEquals(getToastMessage("Incorrect credentials supplied"), "Incorrect credentials supplied");


/*
        WebElement errorEmailMessge = driver.findElement(By.xpath("//p[contains(normalize-space(),'Email is required')]"));
        Assert.assertTrue("Email is required", errorEmailMessge.isDisplayed());
        //getwait();
        //String emailErroe= errorEmailMessge.getText();
        //Assert.assertEquals(errorMessage, errorEmailMessge);
        //System.out.println(emailErroeMsg);


        WebElement errorPwdMessgaeLoc  = driver.findElement(By.xpath("//p[contains(normalize-space(),'Password is required')]"));
        Assert.assertTrue("Password is required",errorPwdMessgaeLoc.isDisplayed());
        //getwait();
        //String pwdErrorMsg = errorPwdMessgaeLoc.getText();
        //Assert.assertEquals(errorMessage, pwdErrorMsg);
        //System.out.println(pwdErrorMsg);

 */

    }
}
