package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class ForeignbBirthRegSteps extends CommonMethods {
    @Given("user is successfully logged in to check for foreign birth motification")
    public void user_is_successfully_logged_in_to_check_for_foreign_birth_motification() {
        WebElement foreignbrth = driver.findElement(By.xpath("//span[contains(normalize-space(),'Foreign Birth Notification')]"));
        click(foreignbrth);
    }
    @When("user checks on requirement terms")
    public void user_checks_on_requirement_terms() {
        WebElement foreignregstart = driver.findElement(By.xpath("//button[contains(normalize-space(),'Start new application')]"));
        click(foreignregstart);
        WebElement checkreq = driver.findElement(By.cssSelector("#consent-checkbox"));
        click(checkreq);
        Assert.assertTrue(checkreq.isEnabled());
        WebElement proceedbtn = driver.findElement(By.xpath("//button[normalize-space()='Proceed']"));
        click(proceedbtn);
    }
    @When("user proceeds with payment")
    public void user_proceeds_with_payment() {
        System.out.println("pass");
    }
}
