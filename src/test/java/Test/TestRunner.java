package Test;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/Feature/Food.feature", // Path to your feature files
    glue = "Steps",                // Package containing step definitions
    plugin = { "pretty", "html:target/cucumber-reports" },
    monochrome = true
)
public class TestRunner {
}