package stepDefinition;

import com.ncr.serenitybdd.steps.serenity.EndUserSteps;
import com.ncr.serenitybdd.steps.serenity.LoginSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginScenario {
	
	LoginSteps loginSteps=new LoginSteps();
	
	@Given("^Open Meijer application on android$")
	public void open_Meijer_application_on_android() throws Throwable { 
	   loginSteps.open_app();
	   loginSteps.click_okay();
	 }
	@Then("^Go to Accounts tab$")
	public void go_to_Accounts_tab() throws Throwable {
	  loginSteps.click_on_account_tab();
	  loginSteps.click_on_account_tab();
	}

	@When("^Insert login credentials$")
	public void insert_login_credentials() throws Throwable {
	   loginSteps.enter_user_name();
	   loginSteps.click_next();
	   loginSteps.enter_password();
	}

	@Then("^User must sign in$")
	public void user_must_sign_in() throws Throwable {
	   loginSteps.click_sign_in();
	   
	}
}
