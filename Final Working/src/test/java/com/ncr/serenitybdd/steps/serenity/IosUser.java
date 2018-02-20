package com.ncr.serenitybdd.steps.serenity;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import utility.Hook;

public class IosUser {
	IOSDriver driver;
	public IosUser() {
		this.driver =   (IOSDriver) Hook.getDriver();
	}
	
	public void click_on_accept() {
		// TODO Auto-generated method stub
		driver.switchTo().alert().accept();
	     System.out.println("Location access granted");
	}

	public void click_on_okay() {
		// TODO Auto-generated method stub
		 
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//	MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("/OK");
//	 //el1.click();
	    MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("OK");
		  el1.click();   
	  //  driver.findElementByXPath("//XCUIElementTypeButton[@name=\"OK\"]").click();
		
	}

	public void click_on_scan() {
		// TODO Auto-generated method stub
		   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("HELP");
		    el2.click();
		    MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Express Checkout\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]");
		    el3.click();
		    driver.swipe(298,234,-221,36, 1000);
		    driver.swipe(298,234,-221,36, 1000);
		    driver.swipe(298,234,-221,36, 1000);
		    driver.swipe(298,234,-221,36, 1000);
		    driver.swipe(66, 239,243,63,1000);
		      
//		    (new TouchAction(driver))
//		      .press({x: 308, y: 228})
//		      .moveTo({x: -230: y: 41})
//		      .release()
//		      .perform()
//		      
//		    (new TouchAction(driver))
//		      .press({x: 308, y: 231})
//		      .moveTo({x: -229: y: 39})
//		      .release()
//		      .perform()
//		      
//		    (new TouchAction(driver))
//		      .press({x: 316, y: 243})
//		      .moveTo({x: -246: y: 47})
//		      .release()
//		      .perform()
//		      
//		    (new TouchAction(driver))
//		      .press({x: 66, y: 239})
//		      .moveTo({x: 243: y: 63})
//		      .release()
//		      .perform()
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

	
}
