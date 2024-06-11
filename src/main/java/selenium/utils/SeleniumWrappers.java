package selenium.utils;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumWrappers extends BaseTest{

	//Weblement element = driver.findElement(locator);
		//element.click();
		
		
		public void click(By locator) {
			
			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration. ofSeconds(5));
				wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
				WebElement element = driver.findElement(locator);
				element.click();
				
			}catch(NoSuchElementException e) {
				
				
			}
			
			//driver.findElement(locator).click();
			
		}
		
		public void sendKeys(By locator, String text) {
			
			driver.findElement(locator).sendKeys(text);
			
		}
		
		public void highlightElement(WebElement element) {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
					element);
		}
		
}
