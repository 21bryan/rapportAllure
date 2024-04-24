package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        plugin = {
                "pretty","html:target/cucumber-reports.html"

        },
        features = "src/test/resources/features",
        glue = {"steps","com/automatisation/pagesObjects"}
)
public class TestRunner extends AbstractTestNGCucumberTests {



}
