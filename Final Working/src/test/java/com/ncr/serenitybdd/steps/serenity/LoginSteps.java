package com.ncr.serenitybdd.steps.serenity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import net.thucydides.core.annotations.Step;
import utility.Hook;

public class LoginSteps {
	AndroidDriver driver;
	
	public LoginSteps() {
		this.driver = (AndroidDriver) Hook.getDriver();
		}
	@Step
	public void open_app()
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		System.out.println("Application opened");
	}
	@Step
	public void click_okay()
	{
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	    MobileElement el1=(MobileElement)driver.findElement(By.id("dialogButton"));
	    el1.click();
		System.out.println("Ok clicked");
	}
	
	 @Step
     public void click_on_account_tab()
     {
     TouchAction touchAction1=new TouchAction(driver);
//    	 driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    	 System.out.println("Timeout");
    	 touchAction1.tap(118, 1850).perform();
    	 System.out.println("Account Tab clicked");
     }
	 @Step
     public void enter_user_name()
     {   	driver.manage().timeouts().implicitlyWait(100000, TimeUnit.SECONDS);
     System.out.println("Timeout");
		 MobileElement el1 = (MobileElement) driver.findElementById("com.meijer.ncr.flms:id/customerEmail");
     el1.click();
     el1.sendKeys("jack1030@gmail.com");
     }
	 @Step
     public void click_next()
     {
    		MobileElement el3 = (MobileElement) driver.findElementById("com.meijer.ncr.flms:id/nextButton");
        	el3.click();
        	System.out.println("Next clicked");
     }
	 @Step
     public void enter_password()
     {  driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
    	 	MobileElement el4 = (MobileElement) driver.findElementById("com.meijer.ncr.flms:id/customerPassword");
        	el4.sendKeys("password1");
        	System.out.println("password inserted");
     }
	 @Step
     public void click_sign_in()
     {
    	  	MobileElement el5 = (MobileElement) driver.findElementById("com.meijer.ncr.flms:id/signInButton");
        	el5.click();
        	System.out.println("sign in clicked");
     }
}
