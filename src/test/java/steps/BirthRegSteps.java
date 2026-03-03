package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
    }
    @When("user proceeds to make payment")
    public void user_proceeds_to_make_payment() {
        System.out.println("pass");
    }

}
