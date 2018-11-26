package TestCases;

import org.testng.annotations.Test;

import baseclass.Base;
import in.Repo;

public class Befor24hrs extends Base{
	

	public Befor24hrs() {
		super();
		// TODO Auto-generated constructor stub
	}

@Test(priority=1)
	public void share() throws InterruptedException {
		Thread.sleep(8000);
		   click("Dolphins@Bills1_Xpath");
		   Thread.sleep(15000);
		 //  swipeU();

	  
		   click("Share_ID");
		    Thread.sleep(4000);
		    swipeU();
		    Thread.sleep(3000);
		   click("Sharepage_Xpath");
		   Report("./Rally.html");
	}

	@Test(priority=2)

public void myticket() throws InterruptedException {
	
	back();
	back();
	swipeU();
	click("TripStatus_Xpath");
	Thread.sleep(3000);
	swipeU();
	Thread.sleep(2000);
	swipeU();
	 Report("./rally.html");
		}
	

	@Test(priority=3)

		public void trip() throws InterruptedException {
		back();
		click("Thetrip_ID");
		Thread.sleep(3000);
		swipeU();
		Thread.sleep(2000);
		swipeU();
		Thread.sleep(3000);
		swipeU();
		Thread.sleep(5000);
		swipeU();
		Thread.sleep(4000);
		click("TheTripFAQ_Xpath");
		swipeU();
		Thread.sleep(2000);
		swipeU();
		Report("./Rally1.html");
		
	}


	@Test(priority=4)
	
	public void map() throws InterruptedException {
		
		back();
		click("MapLR_Xpath");
		Thread.sleep(3000);
		click("Share_ID");
		Thread.sleep(3000);
		swipeU();
		click("Sharepage_Xpath");
		}
	@Test(priority=5)
	
	public void destination() throws InterruptedException {
		
		back();
		back();
		back();
		click("Destination_ID");
		Thread.sleep(2000);
		swipeU();
		Thread.sleep(3000);
		swipeU();
		Thread.sleep(3000);
		swipeU();
		Thread.sleep(2000);
		click("DestMap_Xpath");
		click("MapPopUpY_Xpath");
		Thread.sleep(5000);
		back();
		back();
		back();
		
		
		
	}



}
