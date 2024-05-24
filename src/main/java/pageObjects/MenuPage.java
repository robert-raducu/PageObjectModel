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
