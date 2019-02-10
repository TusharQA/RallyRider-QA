package baseclass;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.gargoylesoftware.css.parser.Locator;
import com.gargoylesoftware.htmlunit.javascript.host.Element;
//import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import com.thoughtworks.selenium.Wait;
import com.thoughtworks.selenium.condition.Presence;
import com.thoughtworks.selenium.webdriven.commands.WaitForCondition;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Base {

	public static Properties OR = new Properties();
//	public static Properties Config = new Properties();
	public static FileInputStream fis;
	AppiumDriver driver;
	 Dimension size;
	 ExtentReports extent;
	 WebElement ele;
	 String locator;
	// ExtentTest logger1;
	// public static WebDriver driver;
//		static ExtentTest test;
//		static ExtentHtmlReporter reporter;
//		static ExtentTest logger;

		static ExtentTest test;
		static ExtentHtmlReporter  htmlReporter;
		static com.aventstack.extentreports.ExtentTest logger;
	
		 InputStream inputStream;
	 


	@BeforeTest

	public void Base() throws IOException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "Wildnet");
		capabilities.setCapability("platformVersion", "8.0.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "net.rallybus.riderappDev");
		capabilities.setCapability("appActivity", "md5d9239bee7c359d68c0e49fee5b2ec573.SplashActivity");
		capabilities.setCapability("newCommandTimeout", 60 * 5);

		//capabilities.setCapability("appPackage", "net.rallybus.riderapp");
		//capabilities.setCapability("appActivity", "md5d9239bee7c359d68c0e49fee5b2ec573.SplashActivity");

		
		// Launch Appium
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	

		fis = new FileInputStream(System.getProperty("user.dir") + "//src//main//resources//Properties//OR.properties");
		OR.load(fis);
	
	
	click("Allow_Xpath");
		click("Hmenu_ID");
		Thread.sleep(2000);
		click("Login_Xpath");
	    type("Email_ID", "wildnet1@rallybus.net");
	    type("Pwd_ID", "wildnet1@rallybus.net");
	    back();
	    click("Loginbtn_Xpath");
        Thread.sleep(8000);
       
	}
	
	

	public void type(String Locator, String value) {
		if (Locator.endsWith("_Xpath")) {
			driver.findElement(By.xpath(OR.getProperty(Locator))).sendKeys(value);

		} else if (Locator.endsWith("_ID")) {
			driver.findElementByAccessibilityId(OR.getProperty(Locator)).sendKeys(value);
		}
	}

	public void click(String locator) {
		
		if (locator.endsWith("_Xpath")) {
			driver.findElement(By.xpath(OR.getProperty(locator))).click();
		} else if (locator.endsWith("_ID")) {
			driver.findElementByAccessibilityId(OR.getProperty(locator)).click();

		}
	}

	
	public void back() {

		driver.navigate().back();
	}

	public void swipeU() throws InterruptedException {
		 
		  size = driver.manage().window().getSize();
		  System.out.println(size);
		  int starty = (int) (size.height * 0.80);
		  
		  int endy = (int) (size.height * 0.20);

		  int startx = size.width / 2;
		  System.out.println("starty = " + starty + " ,endy = " + endy + " , startx = " + startx);
		     
		  driver.swipe(0, 1530, 0, 700, 3000);
		  // driver.swipe(startx, starty, startx, endy, 3000);
		  Thread.sleep(2000);

		// action.press(startX, startY).moveTo((endX - startX),
		// (endY-startY)).release().perform();
	}

	
//	public void zoom()
	{
		
	//	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]\r\n" + 
	//			""));
	//	 WebElement  btnZoomOut;	
	}
	
	public void mTouchAction() throws InterruptedException {
		  
		  size = driver.manage().window().getSize();
		  //Get X Y Coordinates for touch action 1(Top left side).
		  int x1 = (int) (size.width * 0.20);
		  int y1 = (int) (size.height * 0.20);
		  
		  //Get X Y Coordinates for touch action 2(Top right side).
		  int x2 = (int) (size.width * 0.80);
		  int y2 = (int) (size.height * 0.20);
		  
		  //Get X Y Coordinates for touch action 3(Bottom left side).
		  int x3 = (int) (size.width * 0.20);
		  int y3 = (int) (size.height * 0.80);
		  
		  //Get X Y Coordinates for touch action 4(Bottom right side).
		  int x4 = (int) (size.width * 0.80);
		  int y4 = (int) (size.height * 0.80);
		  
		  //Get X Y Coordinates for touch action 5(middle of the screen).
		  int x5 = size.width / 2;
		  int y5 = size.height / 2;
		  
		 // System.out.println("int x1 = "+ int x1 + " ,int y1 = "+ int y1  + " , int x2 = "+ int x2+", int y2= "+ int x3+", int y3= "+ int x4+", int y4= "+ int x5+", int y5= " );
	}
	
	
	
	public void Report(String Rally)
	{
		htmlReporter = new ExtentHtmlReporter(Rally);
	//	htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Rally.Rider.Prod/test-output/Extent Reports/LoginTest.html");
		//ExtentReports extent = new ExtentReports(null);
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		logger = extent.createTest("Rally");
		
		share(extent);
		myticket(extent);
		map(extent);
		Story(extent);
		destination(extent);
		Addons(extent);
		organizer(extent);
		trip(extent);
		
	
		
//	logger.log(Status.PASS, "\"Share\" was Covered.");
		
		//logger.log(Status.FAIL, "\"Login\" is Failed.");
		
		 extent.flush();
		}

//	public void Report1(String Rally1)
//	{
//		htmlReporter = new ExtentHtmlReporter(Rally1);
//		//htmlReporter = new ExtentHtmlReporter(rally2);
//	//	htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Rally.Rider.Prod/test-output/Extent Reports/LoginTest.html");
//		//ExtentReports extent = new ExtentReports(null);
//		ExtentReports extent = new ExtentReports();
//		extent.attachReporter(htmlReporter);
//		logger = extent.createTest("LoginTest");
//		
//		
//		
//	logger.log(Status.PASS, "\"Status\" was covered.");
//		
//		//logger.log(Status.FAIL, "\"Login\" is Failed.");
//		
//		 extent.flush();
//		}
	
//
//	public void Report2()
//	{
//		htmlReporter = new ExtentHtmlReporter("./Rally2.html");
//	//	htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Rally.Rider.Prod/test-output/Extent Reports/LoginTest.html");
//		//ExtentReports extent = new ExtentReports(null);
//		ExtentReports extent = new ExtentReports();
//		extent.attachReporter(htmlReporter);
//		logger = extent.createTest("LoginTest");
//		
//		
//	logger.log(Status.PASS, "\"Thetrip\" was covered.");
//		
//		//logger.log(Status.FAIL, "\"Login\" is Failed.");
//		
//		 extent.flush();
//		}

	
	public void share(ExtentReports extent) {
		
		logger = extent.createTest("Rally");

		logger.log(Status.PASS, "Share is PASS");
		System.out.println("Share was covered successfully");
	}
	
		
	public void myticket(ExtentReports extent) {
		
		logger = extent.createTest("Rally");
	
		logger.log(Status.PASS, "Status is PASS");
		System.out.println("Trip was covered successfully");
	}
	
public void trip(ExtentReports extent) {
		
		logger = extent.createTest("Rally");
	
		logger.log(Status.PASS, "Thetrip is PASS");
		System.out.println("Trip was covered successfully");
	}

public void map(ExtentReports extent) {
	
	logger = extent.createTest("Rally");

	logger.log(Status.PASS, "Map is PASS");
	System.out.println("Map was covered successfully");
}

public void destination(ExtentReports extent) {
	
	logger = extent.createTest("Rally");

	logger.log(Status.PASS, "destination is PASS");
	System.out.println("Destination was covered successfully");
}

public void Addons(ExtentReports extent) {
	
	logger = extent.createTest("Rally");

	logger.log(Status.PASS, "Addons is PASS");
	System.out.println("Addons was covered successfully");
}

public void Story(ExtentReports extent) {
	
	logger = extent.createTest("Rally");

	logger.log(Status.PASS, "story is PASS");
	System.out.println("story was covered successfully");
}

public void organizer(ExtentReports extent) {
	
	logger = extent.createTest("Rally");

	logger.log(Status.PASS, "trip organizer is PASS");
	System.out.println("trip organizer was covered successfully");
}


	
	public void Mail() throws EmailException {
		
		Email email = new SimpleEmail();
		
		email.setFrom("tusharbhatiawnt@gmail.com");
		email.setSubject("Test Report");
		email.addTo("tusharbhatia57@gmail.com");
		email.send();
				
	}
	
}
