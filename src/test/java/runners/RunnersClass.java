package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //features = "src/test/resources/features/login.feature",
        features = "src/test/resources/features/",
        glue = "steps",
        dryRun = false,
        //dryRun = true,
        tags = "@regression1",
        plugin = {"pretty","html:target/cucumber.html",}
)
public class RunnersClass {
}
