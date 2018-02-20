package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Hook;

public class AppiumScenario {

private WebDriver driver;
	
	public AppiumScenario() {
		this.driver = Hook.getDriver();
	}
	
	@Given("^I open the application$")
	public void i_open_the_application() throws Throwable {
	   // Assert.assertTrue(driver.findElement(By.xpath("//*[@text='OK']")).isDisplayed()); 
		System.out.println("opened"); 
		//driver.findElement(By.id("com.meijer.ncr.flms:id/dialogButton")).click();
		driver.findElement(By.xpath("//*[@text='OK']")).click();
		System.out.println("Okay button Tapped"); 
	}

	@When("^I tap on scan$")
	public void i_tap_on_scan() throws Throwable {
	//	driver.findElement(By.xpath("//*[@text='OK']")).click();
		
		//driver.findElement(By.xpath("//*[@text='Next']")).click();
		//System.out.println("Scan pressed");
		
	}

	@Then("^I validate welcome screen$")
	public void i_validate_welcome_screen() throws Throwable {
	  //Assert.assertTrue(driver.findElement(By.xpath("//*[@text='SCAN']")).isDisplayed(), "Custom View is not displayed");
		System.out.println("Done"); 
	  
	}
}
