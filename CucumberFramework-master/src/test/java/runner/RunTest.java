package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import net.serenitybdd.cucumber.CucumberWithSerenity;



/**
 * @author CHIRAG
 *
 */

// Uncomment @RunWith if you are using Junit to run Test 
@RunWith(Cucumber.class)

@CucumberOptions(features={"src//test//java//features"}
					,glue={"stepDefination","utility"}
					,plugin = {"pretty", "html:target/cucumber"}
					, tags ={"@ios"}
		)
@Test
public class RunTest extends AbstractTestNGCucumberTests{

}
