/**
 * 
 */
package utility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

//import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.MobileDriver;
public class Hook {
	public static WebDriver driver;
	static AppiumDriver<IOSElement> iosdriver;
	public static AndroidDriver androidDriver;

	
	
	@Before("@web")
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Before("@appium")
	public void setUpAppium() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung S7");
		cap.setCapability("version","7.0");
		cap.setCapability("appPackage", "com.meijer.ncr.flms");
		cap.setCapability("appActivity", "com.meijers.flms.MyTabActivity");
		cap.setCapability("app", "/Users/syamanth/Downloads/Meijer.apk");
		driver = new AndroidDriver<WebElement> (new URL("http://0.0.0.0:4723/wd/hub"), cap);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//cap.setCapability(MobileCapabilityType.APP, "C:\\Projects\\Android\\Base.apk");
		//cap.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir")+"//App//ApiDemos.apk");
		//driver = new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.quit();
	}
	@Before("@android")
	public void setUpAndroid() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung S7");
		cap.setCapability("version","7.0");
		cap.setCapability("appPackage", "com.meijer.ncr.flms");
		cap.setCapability("appActivity", "com.meijers.flms.MyTabActivity");
		cap.setCapability("app", "/Users/syamanth/Downloads/Meijer.apk");
		cap.setCapability("noReset", "true");
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
		
		//driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 System.out.println("Application installed");
		// driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		 System.out.println("Time out");
		//driver.findElement(By.id("com.meijer.ncr.flms:id/dialogButton")).click();
		
		//driver.quit();
	}
	@Before("@ios")
	public void setUpIos() throws MalformedURLException {
		 DesiredCapabilities caps = new DesiredCapabilities();
		   caps.setCapability("platformName", "iOS");
		   caps.setCapability("platformVersion", "11.2.1");
		   caps.setCapability("deviceName", "Harish iPhone");
		   caps.setCapability("udid", "8ddbe12aabcb08da09d5cad64b3c2623fee60a9b");
		   caps.setCapability("app", "/Users/syamanth/Desktop/Express Checkout.ipa");
		   //caps.setCapability("noReset", "true");
		   
		    driver = new IOSDriver(new URL("http://0.0.0.0:4723/wd/hub"),caps);
		    //Test Actions Here
		    System.out.println("Application installed");
		    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		    
	   // iosdriver.switchTo().alert().accept();
	  // System.out.println("Location access granted");
		    
	  // iosdriver.findElement(By.name("OK")).click();
		    
		 //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	 
	    //iosdriver.switchTo().alert().accept();
		   
		 // MobileElement el1 = (MobileElement) iosdriver.findElementByAccessibilityId("OK");
	 //  el1.click();
//		    System.out.println("Okay clicked");
//		    //Help
//		    MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("HELP");
//		    el2.click();
//		    MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Express Checkout\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]");
//		    el3.click();
//		    MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Close");
//		    el4.click();
//		    MobileElement el5 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Express Checkout\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]");
//		    el5.click();
//		    MobileElement el6 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Express Checkout\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[1]");
//		    el6.click();
//		    MobileElement el7 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Express Checkout\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[2]");
//		    el7.click();
//		    MobileElement el8 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Express Checkout\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTable/XCUIElementTypeCell[4]");
//		    el8.click();
//		    MobileElement el9 = (MobileElement) driver.findElementByAccessibilityId("Back");
//		    el9.click();
		  //  MobileElement el10 = (MobileElement) iosdriver.findElementByXPath("//XCUIElementTypeApplication[@name=\"Express Checkout\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeButton");
		  //  el10.click();
//		    driver.switchTo().alert().accept();
	}
	
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	public static AppiumDriver<IOSElement> getIOSDriver()
	{
		return iosdriver;
	}
	public static AndroidDriver getAndroidDriver()
	{
		return androidDriver;
	}
}
