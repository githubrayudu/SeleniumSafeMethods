package utilityMethod;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SafeClick extends BaseDriver {

	
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

}
