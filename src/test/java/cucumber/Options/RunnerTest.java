package cucumber.Options;

//import org.junit.runner.RunWith;

// import io.cucumber.junit.Cucumber;
// import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.*;
// @RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue={"stepDefinitions"},
		plugin="json:target/jsonReports/cucumber-report.json"
//		tags="not @ignore"
		)
public class RunnerTest extends AbstractTestNGCucumberTests  {

}
