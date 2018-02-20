package com.ncr.serenitybdd.steps.serenity;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import net.thucydides.core.annotations.Step;
import utility.Hook;

public class ScanItemSteps {
	
	AndroidDriver driver;
	public ScanItemSteps() {
		this.driver = (AndroidDriver) Hook.getDriver();
	}
	@Step
	public void waiting()
	{
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS); 
		System.out.println("timeout");
	}
	@Step
	public void click_on_scan()
	
	{	
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  
    	TouchAction touchAction=new TouchAction(driver);
    	touchAction.tap(536, 1802).perform();
    	System.out.println("Scan Clicked");
	}
	@Step
	public void check_popup()
	{
		if(!driver.findElements(By.id("com.meijer.ncr.flms:id/closeButton")).isEmpty())
		{
			driver.findElement(By.id("com.meijer.ncr.flms:id/closeButton")).click();
			System.out.println("close clicked");
		}
	}
	@Step
	public void enter_item_code(String item_code)
	{   
		MobileElement el3 = (MobileElement) driver.findElementById("android:id/message");
    	el3.sendKeys(item_code);
    	System.out.println("item entered");
	}
	@Step
	public void click_okay()
	{   
		MobileElement el4 = (MobileElement) driver.findElementById("android:id/button1");
    	el4.click();
    	System.out.println("Okay Clicked");
	}

}
