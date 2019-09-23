import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Code Room_Automation/Java codes/GitHub/AutomationTest/src/test/resources/Features/CreateAccount.feature:11"},
        plugin = {"pretty"},
        monochrome = true,
        glue = {"uk.co.automationTest"})
public class Parallel01IT {
}
