package cucumberTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Feature",
        glue={"stepDefinition"},
        dryRun = true,
        monochrome = true
)

public class TestRunner {
}
