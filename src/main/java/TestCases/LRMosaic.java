package TestCases;

import java.awt.List;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.testng.annotations.Test;

import baseclass.Base;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.SwipeElementDirection;
import io.appium.java_client.TouchShortcuts;


public class LRMosaic extends Base {
	WebDriver driver;
	

	public LRMosaic() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Test
	public void Case1() throws IOException, InterruptedException {
			  // click("BusLocation_ID");
	  // Thread.sleep(9000);
	 //  swipeU();
	 //Thread.sleep(3000);
	  // swipeU();
		}
		
	  //  click("ArrowLR_ID");
	//    Thread.sleep(2000);
	 //   click("TripO_Xpath");
	 //   Thread.sleep(8000);
	  //  click("BusInfoTushar_ID");
	   // click("BusInfoTushar_Xpath");
	  //  Thread.sleep(5000);
	
	    
      //	  TouchAction Action=  new TouchAction(driver);
   	//		  Action.press(0, 200).waitAction(TimeUnit.SECONDS.equals("10")).moveTo(0, 500).release().perform();
	    

//       swipeU();
//       Thread.sleep(5000);
//	    
//	    click("BoardRiders_Xpath");
	//    click("BoardOtherRiders_Xpath");
	  //  click("PopUpY_ID");
		//Thread.sleep(5000);
						
		
		
//		click("ArrowHM_ID");
//		click("FordEco_PopularEvent_Xpath");
//		click("ArrowLR_ID");
//		click("Destination1_Xpath");
//		
		
		
//		  TouchAction action = new TouchAction();
//		    action.press(0, 500)
//		            .waitAction(200)
//		            .moveTo(0, 200)
//		            .release()
//		            .perform();
//	
	
		
		
//		click("DestMap_Xpath");
//		click("DestMapPopoUP_Xpath");
		
		//@Test
	public void Dest() throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		back();
		back();
		
		click("Destination_ID");
		Thread.sleep(2000);
		swipeU();
		swipeU();
		Thread.sleep(5000);
		click("MapFrame_Xpath");
		Thread.sleep(2000);
		click("MapPopUpY_Xpath");
		Thread.sleep(2000);
		back();
		back();
		back();
		Thread.sleep(3000);
		
	
	}	
	
		//@Test
		public void Story() throws InterruptedException {
			
			click("Story2_Xpath");
			Thread.sleep(3000);
			swipeU();
			swipeU();
			click("Video_Xpath");
			
		}	
}
