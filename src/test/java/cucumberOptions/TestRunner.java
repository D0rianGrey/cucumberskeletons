package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinitions",
        tags = "@SeleniumTest",
        plugin = {"pretty","html:target/cucumber","json:target/cucumber.js","junit:target/cukes.xml"}
        //dryRun = true
)
public class TestRunner {

}
