package tests;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class JavascriptExecutorExample extends BaseTest{

	@Test
	public void example1() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		
		
		//jse.executeScript("", obj1,obj2,obj3); //Object...args {obj1, obj2, obj3}
		                                       //  index         0      1     2
		
		//jse.executeScript("arguments[1]", obj1,obj2,obj3);
		
		//jse.executeScript("arguments[1]", obj1, obj2, obj3);
		/*	
			//alternativa pentru click()
			jse.executeScript("arguments[0].click()", app.getWebElement(app.menu.searchIcon));
			//alternativa pentru sendKeys()
			jse.executeScript("arguments[0].value='Storm'", app.getWebElement(app.menu.searchInput));	
			//alternativa pentru click()
			jse.executeScript("arguments[0].click()", app.getWebElement(app.menu.searchIcon));
		*/
			
		/*	jse.executeScript("arguments[0].click();"
					+ "arguments[1].value='Storm';"
					+ "arguments[0].click();", 
					app.getWebElement(app.menu.searchIcon), 
					app.getWebElement(app.menu.searchInput));
				
		*/
			jse.executeScript("document.getElementsByClassName('icon-search')[0].click();"
					+ "document.getElementsByClassName('search_field')[0].value='cooking';"
					+ "document.getElementsByClassName('icon-search')[0].click();");
			
			//alternativa pentru isDisplayed()
		
			String visible = jse.executeScript("return document.getElementsByClassName('post_title')[0]."
					+ "childNodes[0].checkVisibility()").toString();
			
			System.out.println(visible);
			
			assertEquals(visible, "true");
			
			boolean isVisible = Boolean.parseBoolean(visible);
			assertTrue(isVisible);
			
			
			String bookTitle = jse.executeScript("return document.getElementsByClassName('post_title')[0]."
					+ "childNodes[0].innerText").toString();
			
			System.out.println(bookTitle);
			
			jse.executeScript("document.getElementsByClassName('post_title')[0]."
					+ "childNodes[0].click()");
			
			//alternativa pentru getCurrentUrl()
			String currentUrl = jse.executeScript("return document.URL").toString();
			System.out.println(currentUrl);
			
			//alternativa pentru getTitle()
			
			String currentPageTitle = jse.executeScript("return document.title").toString();
			System.out.println(currentPageTitle);
		}
}
