package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class ReissuanceSteps extends CommonMethods {
    @Given("user is successfully logged in to get certificate reissuace")
    public void user_is_successfully_logged_in_to_get_certificate_reissuace() {
        WebElement reissuacebtn = driver.findElement(By.xpath("//span[contains(normalize-space(),'Reissuance')]"));
        click(reissuacebtn);
        WebElement startreissu = driver.findElement(By.xpath("//button[contains(normalize-space(),'Start new application')]"));
        click(startreissu);
    }
    @When("user checks on all requirement terms")
    public void user_checks_on_all_requirement_terms() {
        WebElement chkreq = driver.findElement(By.xpath("//input[@id='consent-checkbox']"));
        click(chkreq);
        Assert.assertTrue(chkreq.isEnabled());
        WebElement procdbut = driver.findElement(By.xpath("//button[normalize-space()='Proceed']"));
        click(procdbut);
    }
    @When("user proceeds to payment")
    public void user_proceeds_to_payment() {
        System.out.println("provide payment");
    }

}
