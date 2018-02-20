package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

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
	IOSDriver driver;
	
	public IosScenario() {
		this.driver =   (IOSDriver) Hook.getDriver();
	}
	
	@Given("^Open Meijer application on ios$")
	public void open_Meijer_application_on_ios() throws Throwable {
		System.out.println("application opened");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	   
	}
	@Then("^Click on location accept button$")
	public void click_on_location_accept_button() throws Throwable {
		driver.switchTo().alert().accept();
	     System.out.println("Location access granted");
	     
	    
	}

	@Then("^Click on okay button$")
	public void click_on_okay_button() throws Throwable {
	    
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("/OK");
//	 //el1.click();
	    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("OK");
		  el1.click();   
	  //  driver.findElementByXPath("//XCUIElementTypeButton[@name=\"OK\"]").click();
		

	}

	@When("^Click on Scan button on ios$")
	public void click_on_Scan_button_on_ios() throws Throwable {
		   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("HELP");
		    el2.click();
		    MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Express Checkout\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]");
		    el3.click();
		    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Close");
		    el4.click();
		    MobileElement el5 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Express Checkout\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]");
		    el5.click();
		    MobileElement el6 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Express Checkout\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]");
		    el6.click();
		    MobileElement el7 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Express Checkout\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]");
		    el7.click();
		    MobileElement el8 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Express Checkout\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]");
		    el8.click();
		    MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("Back");
		    el9.click();
	
		
		driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Express Checkout\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeButton").click();
		
	  driver.switchTo().alert().accept();
	    
	    
	   
	}

	@Then("^Camera should be invoked on ios$")
	public void camera_should_be_invoked_on_ios() throws Throwable {
	  System.out.println("camera opened");
	}

}
