package commonMethod;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src//test//resources//Feature",
		glue="StepDefinition",
		tags={"@createaccountscenario"},
		monochrome=true,
		plugin={"html:target","json:target/reports.json"}		
		)

public class TestRunner {

}
