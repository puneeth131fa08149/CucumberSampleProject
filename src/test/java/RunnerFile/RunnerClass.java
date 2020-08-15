package RunnerFile;

import org.junit.runner.RunWith;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.runtime.model.CucumberFeature;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "E:\\MavenProject\\CucumberSampleProject\\src\\test\\java\\FeatureFile\\File.feature",
		glue = {"StepDefination"},
		plugin= {"pretty","html:target/site/cucumber-pretty",
				"html:target/cucumber-report/cucumber-pretty",
				"rerun:target/cucumber-report/rerun.txt"
		},
		monochrome = true,
		dryRun = false
		)
public class RunnerClass {
	private TestNGCucumberRunner testNGcucumberrunner;

	@BeforeClass(alwaysRun=true)
	public void setUp() {
		testNGcucumberrunner=new TestNGCucumberRunner(this.getClass());
	}
	@Test(groups="cucumber",description="Runs Cucumber feature",dataProvider="features")
	public void feature(CucumberFeatureWrapper cucumberfeature) {
		testNGcucumberrunner.runCucumber(cucumberfeature.getCucumberFeature());	
	}
	@DataProvider
	public Object[][] features() {
		return testNGcucumberrunner.provideFeatures();
	}
	@AfterClass(alwaysRun=true)
	public void tearDown() {
		testNGcucumberrunner.finish();
		//extend.flush();
	}

}
