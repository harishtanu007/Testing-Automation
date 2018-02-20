package stepDefinition;

import org.openqa.selenium.By;

import com.ncr.serenitybdd.steps.serenity.LoginSteps;
import com.ncr.serenitybdd.steps.serenity.ScanItemSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ScanItemScenario {
	ScanItemSteps scanItemSteps=new ScanItemSteps();
	LoginSteps loginSteps=new LoginSteps();
	String item="8000570550013";
	@When("^Click on scan$")
	public void click_on_scan() throws Throwable {
		System.out.println("In scan item scenario");
		//loginSteps.open_app();
	    //loginSteps.click_okay();
	   scanItemSteps.check_popup();
	   scanItemSteps.click_on_scan();
	   
	}

	@Then("^Insert Item Code$")
	public void insert_Item_Code() throws Throwable {
	  scanItemSteps.enter_item_code(item);
	  System.out.println("item inserted");
	}

	@When("^Click okay$")
	public void click_okay() throws Throwable {
	   scanItemSteps.click_okay();
	   System.out.println("ok clicked");
	}

	@Then("^Item must be added$")
	public void item_must_be_added() throws Throwable {
	    System.out.println("item scanned");
	}
}
