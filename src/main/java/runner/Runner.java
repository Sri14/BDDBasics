package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/java/feature/Tags.feature", // path for feature package
		glue = {"stepDef"}, // path for step  definition package 
		plugin= {"pretty","html:html-output"}, // Html report
		monochrome = true, // Print clear logs in console
		dryRun = false // checks if the feature files have related step definitions 
		//tags = {"@Smoke","@regression", "~@e2e"} //~ is used as ignore
		)


public class Runner {

}
