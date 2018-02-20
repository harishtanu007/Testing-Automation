package stepDefinition;

import java.util.concurrent.TimeUnit;

import com.ncr.serenitybdd.steps.serenity.LoginSteps;
import com.ncr.serenitybdd.steps.serenity.ScanItemSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StartOfTripScenario {
	 LoginSteps loginSteps=new LoginSteps();
	 ScanItemSteps scanItemSteps=new ScanItemSteps();
	 String sot="StoreNumber=3300\n" +
 	    	"SoapEndPoint=http://90.145.88.37:9292/SelfScanEnginePlugin";
	 @Given("^Go to scan button$")
	public void go_to_scan_button() throws Throwable {
	  loginSteps.open_app();
	  loginSteps.click_okay();
	  scanItemSteps.click_on_scan();
	  }

	@Then("^Insert start of trip$")
	public void insert_start_of_trip() throws Throwable {
	 scanItemSteps.enter_item_code(sot);
	}

	@When("^click okay button$")
	public void click_okay_button() throws Throwable {
	    scanItemSteps.click_okay();
	}


	@Then("^Trip must start$")
	public void trip_must_start() throws Throwable {
		System.out.println("Trip Started");
	}
}
