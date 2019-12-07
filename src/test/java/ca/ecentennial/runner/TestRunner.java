package ca.ecentennial.runner;


import ca.ecentennial.glue.StepHooks;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "src/test/resources",
        glue = "ca.ecentennial.glue",
        tags = "@Ecentennial",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class TestRunner {

}
