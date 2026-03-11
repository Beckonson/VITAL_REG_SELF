package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.CommonMethods;
import utils.ConfigReader;

public class ForeignbBirthRegSteps extends CommonMethods {
    @Given("user is successfully logged in to check for foreign birth notification")
    public void user_is_successfully_logged_in_to_check_for_foreign_birth_notification() {

        //WebElement foreignbrth = driver.findElement(By.xpath("//span[contains(normalize-space(),'Foreign Birth Notification')]"));
        click(foreignbirthreg.foreignbrth);
    }
    @When("user checks on requirement terms")
    public void user_checks_on_requirement_terms() {
        getwait();
        //WebElement foreignregstart = driver.findElement(By.xpath("//button[contains(normalize-space(),'Start new application')]"));
        click(foreignbirthreg.foreignregstart);

        //WebElement checkreq = driver.findElement(By.cssSelector("#consent-checkbox"));
        click(foreignbirthreg.checkreq);
        Assert.assertTrue(foreignbirthreg.checkreq.isEnabled());

        //WebElement proceedbtn = driver.findElement(By.xpath("//button[normalize-space()='Proceed']"));
        click(foreignbirthreg.proceedbtn);
        getwait();
    }
    @And("user proceeds with payment")
    public void user_proceeds_with_payment() {
        System.out.println("my test passed");

        //WebElement bankcard = driver.findElement(By.id("cardNumber"));
        //sendText(bankcard, "5178 6810 0000 0002");
        sendText(foreignbirthreg.bankcard, "5178 6810 0000 0002");

        //WebElement carddt = driver.findElement(By.cssSelector("[name='cardExpiry']"));
        //sendText(carddt, "01/30");
        sendText(foreignbirthreg.carddt,"01/30");

        WebElement bkcvv = driver.findElement(By.cssSelector("[name='cvv']"));
        sendText(bkcvv, "123");
        //sendText(foreignbirthreg.bkcvv, "123");

        //WebElement cardtyp = driver.findElement(By.name("cardName"));
        //sendText(cardtyp, "card");
        sendText(foreignbirthreg.cardtyp, "card");

        //WebElement billadr = driver.findElement(By.id("billingAddress"));
        //sendText(billadr, "NX street 345 Denmark");
        sendText(foreignbirthreg.billadr,"NX street 345 Denmark");

        //WebElement countrydrop = driver.findElement(By.cssSelector("#react-select-2-placeholder"));
        click(foreignbirthreg.countrydrop);
        getJSExecutor();
        Actions actions = new Actions(driver);
        actions.moveToElement(foreignbirthreg.countrydrop).click();
        WebElement option = getwait().until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Norway']")));
        //click(option);
        click(foreignbirthreg.option);

        //WebElement zipcd = driver.findElement(By.cssSelector("[name='postalCode']"));
        //sendText(zipcd, "5000");
        sendText(foreignbirthreg.zipcd, "5000");

        WebElement submitbt = driver.findElement(By.className("submit_btn"));
        click(submitbt);
        //click(foreignbirthreg.submitbt);




    }


}

