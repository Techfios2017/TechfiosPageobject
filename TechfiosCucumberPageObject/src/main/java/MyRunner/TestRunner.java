package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "/Users/eldrid/TrialGithub/TechfiosCucumberPageObject/src/main/java/Features/login.feature", //the path of the feature files
		glue={"stepDefinitions"} //the path of the step definition files
				
		)

public class TestRunner {

}
