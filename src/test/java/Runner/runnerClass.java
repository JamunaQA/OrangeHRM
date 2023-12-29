package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature File/Login.feature", glue = "stepDefinition")
public class runnerClass {
	//it should combine the feature file and step definition file
	//runner define

}
