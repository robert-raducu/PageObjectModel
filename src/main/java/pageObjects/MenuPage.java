package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage {

	public WebDriver driver;
	
	public MenuPage(WebDriver driver) {
		this.driver = driver;
	
	}
	
	//locatori/ webelements
	/*
	 * driver.findElement(By.linkText("Login")
	 */
	public By loginLink = By.linkText("Login");
	public By contactsLink = By.linkText("CONTACTS");
	public By shopLink = By.linkText("BOOKS");
	public By blogLink = By.linkText("BLOG");
	public By aboutLink = By.linkText("ABOUT");
	public By blogSubMenuClassic = By.linkText("Classic");
	public By searchIcon = By.cssSelector("button[class*='icon-search']");
	public By searchInput = By.cssSelector("input[class='search_field']");
	
	// WebElement loginButton = driver.findElement(By.linkText("Login")); //nu e refolosibila 
	
	//metode specifice functionalitatii pe care o au
	
	public void navigateTo(By locator) {
		driver.findElement(locator).click();
	}
	
	//navigateTo(contactsLink)
	//navigateTo(loginLink) => se refoloseste metoda
	
	/* public void navigateToLogin(By locator) {
		loginButton.click(); //functioneaza la fel, doar ca e single use, si nu prea vrem asta
	} */
}
