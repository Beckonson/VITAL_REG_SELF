package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

public class DeathNotificationSteps extends CommonMethods {
    @Given("user is successfully logged in to start new death registration")
    public void user_is_successfully_logged_in_to_start_new_death_registration() {
        WebElement deathregstart = driver.findElement(By.xpath("//span[contains(normalize-space(),'Death Notification')]"));
        click(deathregstart);
    }
    @When("user clicks on start new death registration")
    public void user_clicks_on_start_new_death_registration() {
        WebElement startdeathreg = driver.findElement(By.xpath("//button[contains(normalize-space(),'Start new application')]"));
        click(startdeathreg);
    }
    @When("user checks on requirement instructions")
    public void user_checks_on_requirement_instructions() {
        WebElement checkdeathreq = driver.findElement(By.xpath("//input[@id='consent-checkbox']"));
        click(checkdeathreq);
        Assert.assertTrue(checkdeathreq.isEnabled());
        WebElement proced = driver.findElement(By.xpath("//button[normalize-space()='Proceed']"));
        click(proced);
    }
    @When("user provides Particulars of Deceased")
    public void user_provides_particulars_of_deceased() {
        System.out.println("provide death particullars");
    }

}
