package utilityMethod;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SafeMethods extends BaseDriver {
	
	private static WebDriverWait safewait(int timeofSeconds) {
		return new WebDriverWait(driver, Duration.ofSeconds(timeofSeconds));
	}

	// by id
	public static void safeClickId(int timeofSeconds, String locatorOfId) {
		try {
//				WebElement element = driver.findElement(By.id(locatorOfId));

			safewait(timeofSeconds).until(ExpectedConditions.elementToBeClickable(By.id(locatorOfId))).click();;

		} catch (ElementNotInteractableException e) {
			WebElement element = driver.findElement(By.id(locatorOfId));
			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].click();", element);

		} catch (Exception e) {
			System.out.println("there is an error in SafeClickid Method ");
		}
	}

	// by name
	public static void safeClickName(int timeofSeconds, String locatorOfName) {
		try {
			safewait(timeofSeconds).until(ExpectedConditions.elementToBeClickable(By.name(locatorOfName))).click();
		} catch (ElementNotInteractableException e) {
			WebElement element = driver.findElement(By.name(locatorOfName));
			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].click();", element);

		} catch (Exception e) {
			System.out.println("there is an error in safeClickName Method ");
		}
	}

	// by class name
	public static void safeClickClassName(int timeofSeconds, String locatorOfClassName) {
		try {
			safewait(timeofSeconds).until(ExpectedConditions.elementToBeClickable(By.className(locatorOfClassName)))
					.click();
		} catch (ElementNotInteractableException e) {
			WebElement element = driver.findElement(By.className(locatorOfClassName));
			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].click();", element);

		} catch (Exception e) {
			System.out.println("there is an error in safeClickClassName Method ");
		}
	}

	// by link text
	public static void safeClickLinkText(int timeofSeconds, String locatorOfLinkText) {
		try {
			safewait(timeofSeconds).until(ExpectedConditions.elementToBeClickable(By.linkText(locatorOfLinkText)))
					.click();
		} catch (ElementNotInteractableException e) {
			WebElement element = driver.findElement(By.linkText(locatorOfLinkText));
			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].click();", element);

		} catch (Exception e) {
			System.out.println("there is an error in safeClickLinkText Method ");
		}
	}

	// by partial link text
	public static void safeClickPartialLinkText(int timeofSeconds, String locatorOfPartialLinkText) {
		try {
			safewait(timeofSeconds)
					.until(ExpectedConditions.elementToBeClickable(By.partialLinkText(locatorOfPartialLinkText)))
					.click();
		} catch (ElementNotInteractableException e) {
			WebElement element = driver.findElement(By.partialLinkText(locatorOfPartialLinkText));
			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].click();", element);

		} catch (Exception e) {
			System.out.println("there is an error in safeClickPartialLinkText Method ");
		}
	}

	// by tag name
	public static void safeClickTagName(int timeofSeconds, String locatorOfTagName) {
		try {
			safewait(timeofSeconds).until(ExpectedConditions.elementToBeClickable(By.tagName(locatorOfTagName)))
					.click();
		} catch (ElementNotInteractableException e) {
			WebElement element = driver.findElement(By.tagName(locatorOfTagName));
			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].click();", element);

		} catch (Exception e) {
			System.out.println("there is an error in safeClickTagName Method ");
		}
	}

	// by css
	public static void safeClickCssSelector(int timeofSeconds, String locatorOfCssSelector) {
		try {
			safewait(timeofSeconds).until(ExpectedConditions.elementToBeClickable(By.cssSelector(locatorOfCssSelector)))
					.click();
		} catch (ElementNotInteractableException e) {
			WebElement element = driver.findElement(By.cssSelector(locatorOfCssSelector));
			JavascriptExecutor js = (JavascriptExecutor) driver;

			js.executeScript("arguments[0].click();", element);

		} catch (Exception e) {
			System.out.println("there is an error in safeClickCssSelector Method ");
		}
	}

	// by Xpath
	public static void safeClickXpath(int timeofSeconds, String locatorOfXpath) {
		try {
			safewait(timeofSeconds).until(ExpectedConditions.elementToBeClickable(By.xpath(locatorOfXpath))).click();
		} catch (ElementNotInteractableException e) {
			WebElement element = driver.findElement(By.xpath(locatorOfXpath));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);

		} catch (Exception e) {
			System.out.println("there is an error in safeClickXpath Method ");
		}
	}
	
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
	
	private static JavascriptExecutor jsmethod() {
		return (JavascriptExecutor) driver;
	}
private static WebDriverWait safeWait(int inputtime) {
return new WebDriverWait(driver,Duration.ofSeconds(inputtime));	
}
	public static void safeScrollingTopToPaticularPointGradually(int inputtime, int endingPoint) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(inputtime));
		for (int i = 0; i <= endingPoint; i++) {
			jsmethod().executeScript("window.scrollBy(0," + i + ")");
		}
	}
	public static void safeScrollingTopToPaticularPoint(int inputtime, int endingPoint) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(inputtime));
		jsmethod().executeScript("window.scrollBy(0," + endingPoint + ")");
	}
	public static void safeScrollingToBottom(int inputtime) {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(inputtime));
		jsmethod().executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public static void safeScrollingToAnElementByPartialLinkText(int inputTime,String inputIdLocator) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(inputTime));
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(inputTime));
//		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(inputIdLocator)));
		WebElement element = driver.findElement(By.partialLinkText(inputIdLocator));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js .executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", element);
	}
	
	/*
	 * private static WebDriverWait safeWait(int timeOfSeconds) { return new
	 * WebDriverWait(driver, Duration.ofSeconds(timeOfSeconds)); }
	 */
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
