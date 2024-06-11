package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import framework.utils.PropertiesFileProcessor;
import selenium.utils.BaseTest;

public class XpathExample extends BaseTest{
	
	String USER = PropertiesFileProcessor.readPropertiesFile("user", "credentials.properties");
	String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "credentials.properties");

	
	@Test(priority = 1)
	public void xpathExample1() throws InterruptedException {
		/*
		 * CSS:
		 * 	li[class='menu_user_login']
		 * 
		 * XPATH:
		 *   //li[@class='menu_user_login']
		 * 
		 */
		
		//JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebElement loginBtn = driver.findElement
				(By.xpath("//li[@class='menu_user_login']"));
		
		
		//jse.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				//loginBtn);
		
		app.highlightElement(loginBtn);
		
		loginBtn.click();
		
		
		//logical OR
		WebElement userInput = driver.findElement
				(By.xpath("//ul//input[@id='log' or @name='log'] "));
		
		//jse.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				//userInput);
		
		app.highlightElement(userInput);
		
		
		userInput.sendKeys(USER);
		
		//logical AND
		
		WebElement passInput = driver.findElement
				(By.xpath("//ul//input[@type='password' and @name='pwd'] "));
		
		//jse.executeScript("arguments[0].setAttribute('style', 'background:yellow ;border:10px solid green')", 
				//passInput);
		app.highlightElement(passInput);
		
		passInput.sendKeys(PASS);
		
		// direct child
		WebElement submitBtn = driver.findElement
				(By.xpath("//ul//div[@class='popup_form_field submit_field']/input"));
		
		app.highlightElement(submitBtn);
		
		submitBtn.click();
		
		Thread.sleep(5000);
	}
	
	@Test(priority=2)
	public void xpathExample2() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;

		driver.findElement(By.xpath("//span[@class='user_name']")).click(); //atribut
		
		//<a href="https://keybooks.ro/wp-admin/profile.php" class="icon icon-cog">Settings</a>
		/*
		 *  //a[text()='Settings']
		 */
		// text()--> referinta catre textul dintre tag-urile HTML
		driver.findElement(By.xpath("//a[text()='Settings']")).click(); //text
		
		
		/*
		 * <a href="https://keybooks.ro/account/orders/">recent orders</a>
		 * 
		 *  //a[text()='recent orders']
		 *  
		 *  //a[contains(text(), 'recen')]
		 *  
		 *  //a[contains(@href, 'orders' )]
		 *  
		 */
		
		//contains()
				WebElement recentOrderLink = driver.findElement
						(By.xpath("//a[contains(text(), 'recen')]"));
				
				jse.executeScript("arguments[0].setAttribute('style', "
						+ "'background:yellow ;border:10px solid green')", 
						recentOrderLink);
				
				recentOrderLink.click();
				
				WebElement ordersTableLink = driver.findElement
						(By.xpath("//th[contains(@class, 'orders-table__header')]/span[text()='Order']"));
				
				jse.executeScript("arguments[0].setAttribute('style', "
						+ "'background:yellow ;border:10px solid green')", 
						ordersTableLink);
				
				//not()
				WebElement dateTableHeader = driver.findElement
						(By.xpath("//table//span[not(contains(text(), 'Order')) and not(contains(text(), 'Status')) and not(contains(@class, 'woocommerce')) and not(contains(text(), 'Total')) and not(contains(text(), 'Actions')) ]"));
				
				jse.executeScript("arguments[0].setAttribute('style', "
						+ "'background:yellow ;border:10px solid green')", 
						dateTableHeader);
				
				//index
				WebElement statusTableHeader = driver.findElement
						(By.xpath("(//span[@class='nobr'])[3]"));
				
				jse.executeScript("arguments[0].setAttribute('style', "
						+ "'background:yellow ;border:10px solid green')", 
						statusTableHeader);
	}

}