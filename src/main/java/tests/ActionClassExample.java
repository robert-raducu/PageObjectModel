package tests;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class ActionClassExample extends BaseTest{

	
	//@Test
	public void hoverElementTest() throws InterruptedException {
		
		app.hoverElement(app.menu.blogLink);
		Thread.sleep(3000);
		app.hoverElement(app.menu.blogSubMenuClassic);
		Thread.sleep(3000);
		app.click(app.menu.blogSubMenuClassic);
		Thread.sleep(3000);
		app.hoverElement(app.menu.aboutLink);
		
	}
	
	//@Test
	public void sendKeysTest() {
		
		app.click(app.menu.contactsLink);
		
		Keys ctrl = Platform.getCurrent().is(Platform.WINDOWS) ? 
				Keys.CONTROL : Keys.COMMAND;
		
		
		Actions action = new Actions(driver);
		WebElement nameField = app.getWebElement(app.contacts.nameField);
		
		action
		    .moveToElement(nameField)
		    .click()
		    .keyDown(Keys.SHIFT)
		    .sendKeys("this is a placeholder test")
		    .sendKeys(Keys.ARROW_LEFT)
		    .sendKeys(Keys.ARROW_UP)
		    .keyUp(Keys.SHIFT)
		    	.keyDown(ctrl)
		    	.sendKeys("c")
		    	.keyUp(ctrl)
		    .sendKeys(Keys.TAB)
	    		.keyDown(ctrl)
	    		.sendKeys("v")
	    		.keyUp(ctrl)
		    
		.perform();
	}
	
	
	@Test
	public void sendMessageForm() {
		
		app.click(app.menu.contactsLink);
		Actions action = new Actions(driver);
		WebElement nameField = app.getWebElement(app.contacts.nameField);
		
		
		action 
			.sendKeys(nameField, "Test")
			.pause(Duration.ofMillis(2000))
			.sendKeys(Keys.TAB,"email@email.com")
			.pause(Duration.ofMillis(2000))
			.sendKeys(Keys.TAB, "My subject")
			.pause(Duration.ofMillis(2000))
			.sendKeys(Keys.TAB, "Super mesaj!")
			.pause(Duration.ofMillis(2000))
			.sendKeys(Keys.TAB, Keys.ENTER)
		.perform();
		
	}
}
