package com.ncr.serenitybdd;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/features"},
                glue={"stepDefinition","utility"}
                , tags ={"@android"}
)
public class DefinitionTestSuite {
	
}
