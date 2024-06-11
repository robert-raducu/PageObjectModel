package tests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class RefactorLoginTest extends BaseTest{

	@Test
	public void loginTest() {
		
		app.click(app.menu.loginLink);
		app.login.loginInApp("Test","Test");
		assertTrue(app.login.checkMsgIsDisplayed(app.login.errorLoginMsg));	
		
	}
	
	
}