package utilityMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SafeScrolling extends BaseDriver {

	

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
}
