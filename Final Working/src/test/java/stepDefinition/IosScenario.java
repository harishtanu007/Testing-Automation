package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.TouchAction;

import com.ncr.serenitybdd.steps.serenity.IosUser;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import utility.Hook;

public class IosScenario {
	
	IosUser anna=new IosUser();
	
	
	@Given("^Open Meijer application on ios$")
	public void open_Meijer_application_on_ios() throws Throwable {
		
		System.out.println("application opened");
		
	   
	}
	@Then("^Click on location accept button$")
	public void click_on_location_accept_button() throws Throwable {
		anna.click_on_accept();
		
	     
	    
	}

	@Then("^Click on okay button$")
	public void click_on_okay_button() throws Throwable {
		anna.click_on_okay();
	   
		

	}

	@When("^Click on Scan button on ios$")
	public void click_on_Scan_button_on_ios() throws Throwable {
		anna.click_on_scan();
		
	    
	   
	}

	@Then("^Camera should be invoked on ios$")
	public void camera_should_be_invoked_on_ios() throws Throwable {
	  System.out.println("camera opened");
	}

}
