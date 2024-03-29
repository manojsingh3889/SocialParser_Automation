package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty","json:target/cucumberreports.json"},
        glue = "stepdefinitions",
        features = "src/test/resources/features",
        tags = {"@facebook"}
)
public class Runner {
}
