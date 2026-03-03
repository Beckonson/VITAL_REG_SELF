package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import utils.CommonMethods;

public class BirthRegSteps extends CommonMethods {

    @Given("user is successfully logged in to start new birth registration")
    public void user_is_successfully_logged_in_to_start_new_birth_registration() {
        WebElement birthregstart = driver.findElement(By.xpath("//span[normalize-space()='Birth Registration']"));
        click(birthregstart);

    }
    @When("user clicks on start new registration")
    public void user_clicks_on_start_new_registration() {
        WebElement newregstart =  driver.findElement(By.xpath("//button[contains(normalize-space(),'Start new application')]"));
        getwait();
        click(newregstart);
    }
    @When("user checks on requirement instruction")
    public void user_checks_on_requirement_instruction() {
        WebElement checkreq = driver.findElement(By.cssSelector("#consent-checkbox"));
        checkreq.click();
        Assert.assertTrue(checkreq.isEnabled());
        WebElement proccedbtn = driver.findElement(By.xpath("//button[normalize-space()='Proceed']"));
        click(proccedbtn);
        getwait();
    }
    @When("user proceeds to make payment")
    public void user_proceeds_to_make_payment() {
        WebElement bankcardno = driver.findElement(By.id("cardNumber"));
        sendText(bankcardno, "5178 6810 0000 0002");
        WebElement carddate = driver.findElement(By.name("cardExpiry"));
        sendText(carddate, "01/30");
        WebElement bnkcvv = driver.findElement(By.name("cvv"));
        sendText(bnkcvv, "123");
        WebElement cardtype = driver.findElement(By.id("cardName"));
        sendText(cardtype, "card");
        WebElement billaddr = driver.findElement(By.id("billingAddress"));
        sendText(billaddr, "20 igbodo str Abuja");

        WebElement countrydropdown = driver.findElement(By.cssSelector("#react-select-2-placeholder"));
        click(countrydropdown);
        getJSExecutor();
        Actions actions = new Actions(driver);
        actions.moveToElement(countrydropdown).click();
        WebElement option = getwait().until(ExpectedConditions.elementToBeClickable(By.xpath("//div[text()='Nigeria']")));
        click(option);
        WebElement zipcd = driver.findElement(By.cssSelector("[name='postalCode']"));
        sendText(zipcd, "900001");

        WebElement submitbt = driver.findElement(By.className("submit_btn"));
        click(submitbt);
    }

}
