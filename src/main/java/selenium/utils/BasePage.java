package selenium.utils;

import pageObjects.ContactsPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MenuPage;
import pageObjects.ShopPage;

public class BasePage extends SeleniumWrappers{

	public MenuPage menu = new MenuPage(driver);
	public LoginPage login = new LoginPage(driver);
	public ContactsPage contacts = new ContactsPage(driver);
	public ShopPage shop = new ShopPage(driver);
	public HomePage home = new HomePage(driver);
}
