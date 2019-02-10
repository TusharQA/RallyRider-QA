package TestCases;

import org.testng.annotations.Test;

import baseclass.Base;

public class search extends Befor24hrs {

	@Test(priority=9)
	public void search() throws InterruptedException {
		
		back();
		click("Hmenu_ID");
		click("HamFaq_ID");
		Thread.sleep(2000);
		click("HamFaqtheBus_Xpath");
		Thread.sleep(3000);
		click("HamFaqtheBuspt1_Xpath");
		Thread.sleep(2000);
		swipeU();
		Thread.sleep(2000);
		click("HamFaqthebuspt2_Xpath");
		swipeU();
		Thread.sleep(3000);
		click("HamFaqthebuspt3_Xpath");
	
	}

}
