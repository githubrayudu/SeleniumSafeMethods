package utilityMethod;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SafeAlerts extends BaseDriver {

	

	public static void safeAlertsAccept(int inputtime) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(inputtime));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		alert.accept();
	}
	public static void safeAlertsDismiss(int inputtime) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(inputtime));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());

		alert.dismiss();
	}

	public static void safeAlertSendKeysAndAccept(int inputtime,String inputText) {
		
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(inputtime));
	Alert 	alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.sendKeys(inputText);
		alert.accept();
	}

}
