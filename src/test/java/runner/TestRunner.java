package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        stepNotifications = true,
        publish = true,
        features = {"src/main/resources/features"},
        glue = {"stepsDefinitions", "framework"},
        plugin = { "pretty", "junit:target/cucumber-reports/Cucumber.xml" },
        tags =  "@PRUEBA2"
)
public class TestRunner {
}

