package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runners.Suite;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
        },
        monochrome = true,
        features = "./src/test/resources/features",
        glue = {"stepdefinations"},
        dryRun = false,
        tags = "@google or @locators or @checkbox or @radio"
)
public class Runners {

}
