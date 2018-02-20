package com.ncr.serenitybdd.steps.serenity;

import com.ncr.serenitybdd.pages.DictionaryPage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import utility.Hook;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class EndUserSteps {

	AndroidDriver driver;
	LoginSteps loginSteps=new LoginSteps();
	ScanItemSteps scanItemSteps=new ScanItemSteps();
	public EndUserSteps() {
		this.driver = (AndroidDriver) Hook.getDriver();
	}
	

    @Step
    public void clicks_on_scan() {
    	
		 ///driver.findElementByXPath("//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.TabHost/android.widget.RelativeLayout/android.widget.TabWidget/android.widget.FrameLayout[3]/android.widget.ImageView");
//		MobileElement el2 = (MobileElement) driver.findElementById("com.meijer.ncr.flms:id/tabsLayout");
//		el2.click();
//    	TouchAction a2 = new TouchAction();
//    	a2.Tap (536,1802).Perform();

//    	String eotString="2700100009993";
//    	String srt = input.getEditableText().toString();
//    	String sotString="StoreNumber=3300\n" +
//    	"SoapEndPoint=http://90.145.88.37:9292/SelfScanEnginePlugin";
//    	String item="8000570550013";
    	//login code
  
    	String sot="StoreNumber=3300\n" +
    	    	"SoapEndPoint=http://90.145.88.37:9292/SelfScanEnginePlugin";
    	    	String item="8000570550013";
    	    	String eotString="2700100009993";
    	MobileElement el1 = (MobileElement) driver.findElementById("android:id/message");
    	el1.sendKeys(sot);
    	System.out.println("Start of trip Entered");
    	MobileElement el2 = (MobileElement) driver.findElementById("android:id/button1");
    	el2.click();
    	System.out.println("Okay Clicked");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	
    	if(!driver.findElements(By.id("com.meijer.ncr.flms:id/dialogButton")).isEmpty())
    		{
    		System.out.println("Login");
    		driver.findElement(By.id("com.meijer.ncr.flms:id/dialogButton")).click();
    		System.out.println("Okay Clicked");
    		loginSteps.click_on_account_tab();
    		System.out.println("Account Clicked");
    		loginSteps.enter_user_name();
    		System.out.println("Username Entered");
    		loginSteps.click_next();
    		System.out.println("Next Clicked");
    		loginSteps.enter_password();
    		System.out.println("password Entered");
    		loginSteps.click_sign_in();
    		System.out.println("Signin Clicked");
    		}
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    	if(!driver.findElements(By.id("com.meijer.ncr.flms:id/closeButton")).isEmpty())
    	{
    		driver.findElement(By.id("com.meijer.ncr.flms:id/closeButton")).click();
    		System.out.println("close clicked");
    	}
    	
     scanItemSteps.click_on_scan();
     scanItemSteps.enter_item_code(item);
     scanItemSteps.click_okay();
    	
//     	MobileElement el7 = (MobileElement) driver.findElementById("android:id/message");
//    	el3.sendKeys(eotString);
//    	MobileElement el8 = (MobileElement) driver.findElementById("android:id/button1");
//    	el4.click();
    	
    }
    
    @Step
    public void check_camera() {
   System.out.println("camera invoked");
   
    }
}