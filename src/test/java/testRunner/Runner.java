package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
//@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/java/features/login.feature",
        glue = "stepDefinations",
        plugin = {"pretty","html:target/cucumber-reports"},
        monochrome = true
)
public class Runner extends AbstractTestNGCucumberTests {

}
