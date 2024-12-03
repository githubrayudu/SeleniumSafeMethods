package utilityMethod;

import java.time.Duration;

import org.openqa.selenium.By;	
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SafeSendKeys extends BaseDriver {
	
	private static WebDriverWait safeWait(int timeOfSeconds) {
		return new WebDriverWait(driver, Duration.ofSeconds(timeOfSeconds));
	}
	public static void safeSendKeysId(int timeOfSeconds, String inputLocater, String inputString) {
		try {
			safeWait(timeOfSeconds).until(ExpectedConditions.visibilityOfElementLocated(By.id(inputLocater)))
					.sendKeys(inputString);
		} 
			catch (WebDriverException e) {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("document.getElementById('" + inputLocater + "').value='" + inputString + "';");
			}
			 catch (Exception e) {
			System.out.println("There is a error in safeSendKeysId method");
		}
	}
	public static void safeSendKeysClassName(int timeOfSeconds, String inputLocater, String inputString) {
		try {
			safeWait(timeOfSeconds).until(ExpectedConditions.visibilityOfElementLocated(By.className(inputLocater)))
					.sendKeys(inputString);
		}
		// ClassName
		catch (WebDriverException e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementsByClassName('" + inputLocater + "').value='" + inputString + "'");
		} catch (Exception e) {
			System.out.println("There is a error in safeSendKeysClassName method");
		}
	}

	public static void safeSendKeysName(int timeOfSeconds, String inputLocater, String inputString) {
		try {
			safeWait(timeOfSeconds).until(ExpectedConditions.visibilityOfElementLocated(By.name(inputLocater)))
					.sendKeys(inputString);
		}
		// java script for Name
		catch (WebDriverException e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementsByName('" + inputLocater + "').value='" + inputString + "'");
		} catch (Exception e) {
			System.out.println("There is a error in safeSendKeysName method");
		}
	}
	public static void safeSendKeysTagName(int timeOfSeconds, String inputLocater, String inputString) {
		try {
			safeWait(timeOfSeconds).until(ExpectedConditions.visibilityOfElementLocated(By.tagName(inputLocater)))
					.sendKeys(inputString);
		}
		// java script for TageName
		catch (WebDriverException e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementsByTagName('" + inputLocater + "').value='" + inputString + "'");
		} catch (Exception e) {
			System.out.println("There is a error in safeSendKeysTagName method");
		}
	}

	public static void safeSendKeysLinkText(int timeOfSeconds, String inputLocater, String inputString) {
		try {
			safeWait(timeOfSeconds).until(ExpectedConditions.visibilityOfElementLocated(By.linkText(inputLocater)))
					.sendKeys(inputString);
		} catch (Exception e) {
			System.out.println("There is a error in safeSendKeysLinkText method");
		}
	}
	public static void safeSendKeysPartialLinkText(int timeOfSeconds, String inputLocater, String inputString) {
		try {

			safeWait(timeOfSeconds)
					.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(inputLocater)))
					.sendKeys(inputString);
		} catch (Exception e) {
			System.out.println("There is a error in safeSendKeysPartialLinkText method");
		}
	}

	public static void safeSendKeysXpath(int timeOfSeconds, String inputLocater, String inputString) {
		try {
			safeWait(timeOfSeconds).until(ExpectedConditions.visibilityOfElementLocated(By.xpath(inputLocater)))
					.sendKeys(inputString);
		} catch (Exception e) {
			System.out.println("There is a error in safeSendKeysXpath method");
		}
	}

	public static void safeSendKeysCssSelector(int timeOfSeconds, String inputLocater, String inputString) {
		try {
			safeWait(timeOfSeconds).until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(inputLocater)))
					.sendKeys(inputString);
		} catch (Exception e) {
			System.out.println("There is a error in safeSendKeysCssSelector method");
		}
	}
}
