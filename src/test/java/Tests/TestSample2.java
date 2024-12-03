package Tests;

import org.testng.annotations.Test;

import utilityMethod.SafeMethods;

public class TestSample2 extends SafeMethods {

	
	
	TestSample2(){
		 driverInstall("edge");	
	}
	
	

	@Test(priority = 1, enabled = true )

	// Testing the SafeClick Method in utility
	public void method1() {
		
		driver.get("https://www.letskodeit.com/practice");
		safeClickId(3, "hide-textbox");
		safeSendKeysId(3, "displayed-text", "Naresh");

//	driver.quit();
	}

	@Test (priority= 2 , enabled = false )
	public void method2()
	{
		driver.get("https://demo.automationtesting.in/Alerts.html");		
		//OK and Dismiss alert 
		safeClickLinkText(5, "Alert with OK & Cancel");
//		SafeAlerts.safeAlertsAccept(3);

	}
	
	/*
	 * @Test(priority= 3 , enabled = true ) public void method3 () throws
	 * InterruptedException {
	 * 
	 * 
	 * SafeClick.safeClickId(2, "alertButton"); SafeAlerts.safeAlertsAccept(1);
	 * SafeClick.safeClickId(2, "timerAlertButton"); SafeAlerts.safeAlertsAccept(6);
	 * SafeClick.safeClickId(2, "confirmButton"); SafeAlerts.safeAlertsDismiss(3);
	 * SafeClick.safeClickId(3, "promtButton");
	 * SafeAlerts.safeAlertSendKeysAndAccept(3, "Naaaaaa nanananananananan ");
	 * driver.get("https://www.amazon.in/");
	 * 
	 * // SafeScrolling.safeScrollingTopToPaticularPointGradually(5,500);
	 * 
	 * 
	 * // SafeScrolling.safeScrollingTopToPaticularPoint(5,1000);
	 * 
	 * // SafeScrolling.safeScrollingToBottom(6);
	 * SafeScrolling.safeScrollingToAnElementByPartialLinkText(
	 * 10,"Automotive essentials");
	 * 
	 * Thread.sleep(5000); driver.quit(); }
	 */

}
