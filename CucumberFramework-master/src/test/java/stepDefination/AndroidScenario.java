package stepDefination;




import java.util.concurrent.TimeUnit;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import net.thucydides.core.annotations.Steps;
import utility.Hook;
import net.serenitybdd.cucumber.CucumberWithSerenity;



public class AndroidScenario {
	AndroidDriver driver;
	public AndroidScenario() {
		this.driver = (AndroidDriver) Hook.getDriver();
	}
	
	@Given("^Open Meijer application$")
	public void open_Meijer_application() throws Throwable {
	 
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	 System.out.println("Application opened");
	 
	}

	@Then("^Click on okay dialog$")
	public void click_on_okay_dialog() throws Throwable {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		//WebDriverWait wait = new WebDriverWait(driver, 30);
		//wait.until(ExpectedConditions.elementToBeClickable(By
		       // .id("com.meijer.ncr.flms:id/dialogButton")));
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 System.out.println("wait completed");

		 MobileElement el1=(MobileElement)driver.findElement(By.id("dialogButton"));//.click();
		 el1.click();
		System.out.println("Ok clicked");
		//driver.findElement(By.id("com.meijer.ncr.flms:id/dialogButton")).click();
		
		
	}

	@When("^Click on Scan button$")
	public void click_on_Scan_button() throws Throwable {
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//MobileElement el2 = (MobileElement) driver.findElementById("com.meijer.ncr.flms:id/tabsLayout");
		//el2.click();
	}

	@Then("^Camera should be invoked$")
	public void camera_should_be_invoked() throws Throwable {
	   
	}


}
