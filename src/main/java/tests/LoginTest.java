package tests;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import framework.utils.PropertiesFileProcessor;
import pageObjects.LoginPage;
import pageObjects.MenuPage;
import selenium.utils.BaseTest;

public class LoginTest extends BaseTest{

	String USER = PropertiesFileProcessor.readPropertiesFile("user", "credentials.properties");
	String PASS = PropertiesFileProcessor.readPropertiesFile("pass", "credentials.properties");
	
	@Test(priority = 1, groups = "UserManagementFunctionality")
	public void loginTest() {
		
		MenuPage menu = new MenuPage(driver); // primesc driver ul din relatia de mostenire din BaseTest
		
		menu.navigateTo(menu.loginLink); // unul dintre locatorii din MenuPage
		
	
		LoginPage login = new LoginPage(driver);
		login.loginInApp(USER, PASS);
		
		assertTrue(login.checkMsgIsDisplayed(login.successLoginMsg));
		login.logoutFromApp();
	}
	
	@Test(priority = 2, groups = "UserManagementFunctionality")
	public void invalidloginTest() {
		
		MenuPage menu = new MenuPage(driver); // primesc driver ul din relatia de mostenire din BaseTest
		
		menu.navigateTo(menu.loginLink); // unul dintre locatorii din MenuPage
		
	
		LoginPage login = new LoginPage(driver);
		login.loginInApp(USER, "123123");
		
		assertTrue(login.checkMsgIsDisplayed(login.errorLoginMsg));
	}
}
